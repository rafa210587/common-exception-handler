# Lib for exception handler

Exception general handler that helps map where you exception occurred and to clean the many non essential information, leaving the real needed message to facilitate the analyzes of bugs, also can be customize for your needs, with methods to pass the httpCode or Status, you will also need to make a enum class with the messages you want to show to the client.

#### To use:
Import in your project

	<groupId>comum.exception.handler</groupId>
		<artifactId>comum-exception-handler</artifactId>
	<version>?.?.?</version>


And include in your main class the @Import({ CLASNAME.class })

You also need to create two classes, one for the error description you want to assign and another with a specific message for the client about your error.

The first class maybe only a interface Enum class, and the second one MUST implements GenericError that is located at this lib.

# Example of use:

#### Business Class
```
public class Example(){ 
try {
		service.findExample(id);
		} catch (ServiceException | RepositoryException ea) {
			throw ea;
		} catch (Exception e) {
			throw new BusinessException(
				new StringBuilder(Messages.BUSINESS_ERROR_ACCESS_MULTIPLE_APIS)
				.append(e.getMessage()).toString(),
					IntegrationAPIError.ERROR_INTEGRATION_BUSINESS);
		}
```
#### Service Class
```
public ExampleDTO findExample(String id) {
		try {
			ExampleDTO exampleDTO = exampleRepository.findById(id);
			if (exampleDTO != null) {
				return exampleDTO;
			} else {
				throw new RepositoryException(
						new StringBuilder(Messages.SERVICE_ERROR_EXAMPLEDTO_NOT_FOUND).toString(),
						IntegrationAPIError.ERROR_API_EXAMPLEDTO_SERVICE, HttpStatus.NOT_FOUND);
			}
		} catch (RepositoryException e) {
			throw e;
		} catch (Exception e) {
			throw new RepositoryException(
					new StringBuilder(Messages.SERVICE_ERROR_FIND_EXAMPLE)
					.append(e.getMessage())
					.toString(),
					IntegrationAPIError.ERROR_INTEGRATION_EXAMPLEDTO_SERVICE, e);
		}
	}
```

#### Repository Class
```
public ExampleEntity findById(String id) {
		try {
			return genericJdbcTemplate.queryForSQLName(QueriesName.FIND_BY_ID,
					BeanPropertyRowMapper.newInstance(ExampleEntity.class));
		} catch (Exception e) {
			throw new RepositoryException(
					new StringBuilder(Messages.REPOSITORY_ERROR_FIND_ID)
					.append(e.getMessage())
					.toString(), IntegrationAPIError
					.ERROR_INTEGRATION_EXAMPLE_REPOSITORY);
		}
	}
```
#### NotFoundException Class
```
public ExampleEntity findById(String id) {
		try {
			return genericJdbcTemplate.queryForSQLName(QueriesName.FIND_BY_ID,
					BeanPropertyRowMapper.newInstance(ExampleEntity.class));
		} catch (Exception e) {
			throw new NotFoundException(
					new StringBuilder(Messages.DATA_NOT_FOUND)
					.append(e.getMessage())
					.toString(), DataNotFoundError
					.NOT_FOUND_TABLE_PAYMENT);
		}
	}
```