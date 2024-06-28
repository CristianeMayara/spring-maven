# Spring Maven

Spring Boot features, Annotations, Controller, Component Scan, Path, Body e Header Params, Response Entity, IoC DI.


## Routes

```
curl --request GET \
  --url http://localhost:8080/duo/category/1
```

```
curl --request GET \
  --url 'http://localhost:8080/duo/search?name=test'
```

```
curl --request GET \
  --url 'http://localhost:8080/duo/products?name=test&category=sport'
```

```
curl --request GET \
  --url http://localhost:8080/duo/category
```

```
curl --request GET \
  --url http://localhost:8080/ioc/
```

```
curl --request POST \
  --url http://localhost:8080/duo/category \
  --header 'Content-Type: application/json' \
  --data '{
	"name": "Sport"
}
'
```

```
curl --request POST \
  --url http://localhost:8080/duo/admin \
  --header 'cisession: my-generated-token'
```

```
curl --request POST \
  --url http://localhost:8080/duo/admin-plus \
  --header 'cisessiona: my-generated-token' \
  --header 'cisessionb: my-second-token'
```
