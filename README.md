# Patta Android App

Patta Android App is an Android App for Patta App Project assigned by DSC VU.

## Tools

- Android Studio
- Java

## Installation

- Clone this project to your computer.
- Open project in Android Studio.

## App Architecture

graph LR
A[View] --> B[ViewModel]
B --> C[Model]
C --> D[API]

## Directory Structure

|Directory       |Purpose                          
|----------------|-------------------------------
|activities      |It contains all activities with only UI code            
|Listeners       |It contains all Interfaces which will work as listeners
|models          |It contains classes to get interaction with Database/API
|repositories    |It contains Java classes with actual business logic functions
|retrofit        |It contains further two directories Clients and Objs
|Clients         |It contains actual request making Interfaces
|Obs             |It has retrofit objects to retrieve and parse Json responses from Retrofit requests.
|utils           |It contains helping classes
|viewmodels      |It contains View Models for all the activities. Its functions are get called by UI and it further calls relavent repository class' function.

