# Introduction 
Trade Classifier AI sprint - front-end code


## Structure
```
ROOT/
├── .ebextensions/
│   ├── 01_python.config
│   └── 02_env_vars.config
├── static/
│   ├── index.html
│   ├── login.html
│   ├── product.html
│   ├── products.html
│   ├── reset_password.html
│   ├── styles.css
│   └── upload.html
├── main.py
├── Procfile
└── requirements.txt
```

## Description
- .ebextensions/: Directory containing Elastic Beanstalk configuration files.
  - 01_python.config: Configuration related to Python installation and setup.
  - 02_env_vars.config: Configuration for setting environment variables.
- static/: Directory for static HTML files and CSS used by the application.
  - index.html, login.html, product.html, products.html, reset_password.html, upload.html: HTML files for various frontend pages.
  - styles.css: Stylesheet for the HTML files.
- main.py: The main application file where the FastAPI instance (app) is defined.
- Procfile: Defines the command used to start the application on Elastic Beanstalk.
- requirements.txt: Lists all Python dependencies required to run the application.


_NOTE: for local development, add a `.env` file with following parameters:_

```
COGNITO_CLIENT_ID=id
COGNITO_CLIENT_SECRET=secret
COGNITO_USER_POOL_ID=eu-central-1_JNYkSDuHz
REGION_NAME=eu-central-1
USER_GROUP=TCAI-DEMO
PORT=8080
AWS_ACCESS_KEY=YOUR_ACCESS_KEY
AWS_SECRET_KEY=YOUR_SECRET_KEY
AWS_BUCKET_NAME=BUCKET_NAME
DB_HOST: DB_HOST
DB_PORT: DB_PORT typically 5432
DB_NAME: DB_NAME
DB_USER: DB_USER
DB_PASSWORD: DB_PASSORD

```

## Deploying to EB
1) Zip the Project:
  - Create a zip file of your entire project directory, excluding unnecessary files
  - Ensure all files / folders are in the root of the zip (see structure above)
  
2) Upload to AWS Elastic Beanstalk:
  - Go to the AWS Elastic Beanstalk Console.
  - Go to the application you want to upload the code to (or create a new one in case of fresh deployment)
  - Upload the zip file you created and deploy it.
  - See wiki page for more info 


### How to Retrieve Environment Variables

# Cognito: 

- **COGNITO_CLIENT_ID**: Retrieve from AWS Cognito service under "App clients".  
- **COGNITO_CLIENT_SECRET**: Retrieve from AWS Cognito service under "App clients".  
- **COGNITO_USER_POOL_ID**: Found in AWS Cognito under "User Pools".  

  These parameters are required to connect to AWS Cognito, which handles user authentication and authorization.

- **REGION_NAME**: This is the AWS region where your resources are hosted, e.g., `eu-central-1`.  
- **USER_GROUP**: Defined in Cognito under "User Groups".  

  The **REGION_NAME** and **USER_GROUP** help specify where your AWS resources are located and the group to which users belong.

- **PORT**: Port used for running the application. Default is `8080`.  

  The **PORT** variable specifies the port on which the application will run locally or on the server.

# IAM Access Key and Secret Key:

- **AWS_ACCESS_KEY**: Retrieve from AWS IAM, under "Access keys" for the user.  
- **AWS_SECRET_KEY**: Retrieve from AWS IAM, under "Access keys" for the user.  
- **AWS_BUCKET_NAME**: The name of the S3 bucket, found in the S3 console.  

  These AWS credentials (**AWS_ACCESS_KEY**, **AWS_SECRET_KEY**) are used to authenticate with AWS services like S3
  The **AWS_BUCKET_NAME** specifies the bucket used for storage.


# Database: 
- **DB_HOST**: The endpoint of the database, found in the RDS console.  
- **DB_PORT**: The port used by the database, typically `5432` for PostgreSQL.  
- **DB_NAME**: The name of the database, found in the RDS console.  
- **DB_USER**: The username for the database.  
- **DB_PASSWORD**: The password for the database.  

  These parameters are used to connect to your RDS database instance, providing information such as host endpoint, port, database name, and credentials.




## Steps to Manually Add .ebextensions Configuration Files for Frontend

1. Create the .ebextensions Directory:

- If it does not already exist, create a .ebextensions directory under frontend/.

2. Add the Required Configuration Files:

- Manually add the following files to frontend/.ebextensions:
  - file1.config ()
  - file2.config
  - (List all the necessary config files here)

3. Example Content for Each Configuration File:

- file1.config -> 01_python.config

```
# dependencies for DB connection
packages:
    yum:
        libicu-devel: []

# Set Python path
option_settings:
  aws:elasticbeanstalk:application:environment:
    PYTHONPATH: "/var/app/current:$PYTHONPATH"
```

- file2.config -> 02_env_vars.config

```
option_settings:
  aws:elasticbeanstalk:application:environment:
  COGNITO_CLIENT_ID=id
  COGNITO_CLIENT_SECRET=secret
  COGNITO_USER_POOL_ID=eu-central-1_JNYkSDuHz
  REGION_NAME=eu-central-1
  USER_GROUP=TCAI-DEMO
  PORT=8080
  AWS_ACCESS_KEY=YOUR_ACCESS_KEY
  AWS_SECRET_KEY=YOUR_SECRET_KEY
  AWS_BUCKET_NAME=BUCKET_NAME
  DB_HOST: DB_HOST
  DB_PORT: DB_PORT (5432)
  DB_NAME: DB_NAME
  DB_USER: DB_USER
  DB_PASSWORD: DB_PASSWORD

```


## Deploying to EB
1) **Zip the Project**:
  - Create a zip file of the entire project directory, excluding unnecessary files.
  - Ensure all files / folders are in the root of the zip (see structure above).
  
2) **Upload to AWS Elastic Beanstalk**:
  - Go to the AWS Elastic Beanstalk Console.
  - Go to the application you want to upload the code to (or create a new one in case of fresh deployment).
  - Upload the zip file you created and deploy it.
  - See the wiki page for more info.

## Steps to Manually Add .ebextensions Configuration Files for Frontend

1. **Create the .ebextensions Directory**:
   - If it does not already exist, create a `.ebextensions` directory under `frontend/`.

2. **Add the Required Configuration Files**:
   - Manually add the following files to `frontend/.ebextensions`:
     - `file1.config`
     - `file2.config`
     - (List all the necessary config files here)

3. **Example Content for Each Configuration File**:

- **file1.config** -> `01_python.config`

```yaml
# dependencies for DB connection
packages:
    yum:
        libicu-devel: []

# Set Python path
option_settings:
  aws:elasticbeanstalk:application:environment:
    PYTHONPATH: "/var/app/curren
