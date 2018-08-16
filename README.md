# DataGen
Generating example data for out projects


## Usage

DataFactories generates factories, for ex. AdressFactory, NameFactory 
with list of objects single objects is List<String>, other List<HashMap<String,String>>.

Example usage
DataFactories.getAdressFactory().generateData(10).forEach(System.out::println);
{country=Poland, city=Torun, streetNumber=47, street=Black, postalNumber=59-320}
{country=Poland, city=Olsztyn, streetNumber=61, street=Hill, postalNumber=38-150}
{country=Poland, city=Katowice, streetNumber=2, street=Hill, postalNumber=48-676}
{country=Poland, city=Krakow, streetNumber=48, street=Short, postalNumber=6-145}
{country=Poland, city=Rzeszow, streetNumber=58, street=Short, postalNumber=4-392}

DataFactories.getNameFactory().generateData(5).forEach(System.out::println);
Isabella
Ava
Michael
Ava
Olivia

# Doc

## NameFactory
### NameFactory withData(List<String> data)

List<String> data - data to draw for generator

return same object with customised data

### NameFactory withSeed(String seed)

long seed- seed for generator

return same object with customised seed

### NameFactory withSeed(long seed)

long seed - seed for generator

return same object with customised seed

### List<String> generateData(int amount)

int amount - amount of generated data

return generated random data

## AdressFactory
### AdressFactory setStreetNumber(int streetNumber)

int streetNumber - max street number for generator

return same object with customised data

### AdressFactory setpostalAdressSeparator(String postalAdressSeparator)

String postalAdressSeparator - postal adress separator for generator

return same object with customised data

### AdressFactory setCountry(String country)

String country - country for generator

return same object with customised data

### AdressFactory setCityData(List<String> cityData)

List<String> cityData - city data to draw for generator

return same object with customised data

### AdressFactory setStreetData(List<String> streetData)

List<String> streetData - street data to draw for generator

return same object with customised data

### AdressFactory withSeed(String seed)

long seed- seed for generator

return same object with customised seed

### AdressFactory withSeed(long seed)

long seed - seed for generator

return same object with customised seed

### List<HashMap<String,String>> generateData(int amount)

int amount - amount of generated data

return generated random data
