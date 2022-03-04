# AWS Lambda with spring cloud function

<https://docs.spring.io/spring-cloud-function/docs/current/reference/html/aws.html>

## Running localstack

```bash
// run localstack
podman run --rm -it -p 4566:4566 -p 4571:4571 localstack/localstack

// to use network host
podman run --rm -it -p 4566:4566 -p 4571:4571 --network host localstack/localstack

//check
curl http://localhost:4566/health | jq
```

## Terraform with local stack

<https://registry.terraform.io/providers/hashicorp/aws/latest/docs/guides/custom-service-endpoints#localstack>

<https://docs.localstack.cloud/integrations/terraform/>

<https://dev.to/mrwormhole/localstack-with-terraform-and-docker-for-running-aws-locally-3a6d>

```bash
cd infra-as-code
terraform init
terraform validate
terraform plan
terraform apply -auto-approve

aws --endpoint-url=http://localhost:4566 lambda list-functions --profile local

aws --endpoint-url=http://localhost:4566 lambda invoke --function-name Uppercase --profile local --payload '{"exampleField":"test"}' --cli-binary-format raw-in-base64-out  response.json
 
aws --endpoint-url=http://localhost:4566 lambda invoke --function-name Uppercase --profile local --payload '{"exampleField":"test"}' --cli-binary-format raw-in-base64-out --log-type Tail --query 'LogResult' --output text  response.json | base64 -d 
```

```bash
// supplier
aws --endpoint-url=http://localhost:4566 lambda invoke --function-name Uppercase --profile local --payload '{}' --cli-binary-format raw-in-base64-out --log-type Tail --query 'LogResult'  --output text response.json | base64 -d

```