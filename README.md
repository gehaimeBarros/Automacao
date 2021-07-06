# Registration Project
> Short blurb about what your product does.

<img src="https://user-images.githubusercontent.com/59620736/124535880-4afcc800-dded-11eb-98bf-08e74c78e52f.png" heigth="200" width="200">

[![NPM Version][npm-image]][npm-url]
[![Build Status][travis-image]][travis-url]
[![Downloads Stats][npm-downloads]][npm-url]

## Tools Used

* Appium
* Cucumber
* Selenium
* Apache Maven

## Documentation

1. The most up-to-date documentation can be found at C:\Users\gehai\Desktop\Exercicio De Automacao\doc.

## Installation

Windows:

```sh
edit autoexec.bat
```

## Usage example

A few motivating and useful examples of how your product can be used. Spice this up with code blocks and potentially more screenshots.
* For more examples and usage, please refer to the [Wiki][wiki]._

## Development setup

Describe how to install all development dependencies and how to run an automated test-suite of some kind. Potentially do this for multiple platforms.

```sh
make install
npm test
```

## What is it?

* Automated project in Advantage Online Shopping mobile system

## Installing Maven on Windows

To install Maven on windows, we head over to the Apache Maven site to download the latest version and select the Maven zip file, for example, apache-maven-3.3.9-bin.zip.
Then we unzip it to the folder where we want Maven to live.

## Adding Maven to the Environment Path

We add both M2_HOME and MAVEN_HOME variables to the Windows environment using system properties and point it to our Maven folder.
Then we update the PATH variable by appending the Maven bin folder — %M2_HOME%\bin — so that we can run the Maven command everywhere.

* To verify it, we run:

```sh
mvn -version
```

## Meta

Distributed under the XYZ license. See ``LICENSE`` for more information.

[https://github.com/yourname/github-link](https://github.com/gehaimeBarros/)

<!-- Markdown link & img dfn's -->
[npm-image]: https://img.shields.io/npm/v/datadog-metrics.svg?style=flat-square
[npm-url]: https://npmjs.org/package/datadog-metrics
[npm-downloads]: https://img.shields.io/npm/dm/datadog-metrics.svg?style=flat-square
[travis-image]: https://img.shields.io/travis/dbader/node-datadog-metrics/master.svg?style=flat-square
[travis-url]: https://travis-ci.org/dbader/node-datadog-metrics
[wiki]: https://github.com/yourname/yourproject/wiki
