# PinGenerator
PinGenerator is a java library that helps to generate batches of thousand, randomly generated unique PINs with four digits.

# Design considerations
Thread safe to deal with parallel process. 
Used SecureRandom class to generate PINs to improve security(it generates cryptographically strong random number)

# Install PinGenerator
mvn install

# Package PinGenerator
mvn package

#Run test
mvn test
