# Quick Notes

A Kotlin Multiplatform Mobile (Android and iOS) Implementation of a simple Quick Notes App.

## Prerequisite

You may face issues due to the version conflicts to run the application.So,make sure the below
prerequisite is set.

- Embedded JDK 11 been selected in Android Studio.
- Ruby Version 2.6.0 installed.
- CocoaPods Version 1.11.2 (Above 1.10) installed.
- CocoaPods Generate Plugin Version 2.2.2 installed.

Ensure your language Environments are set as follows in your .zshrc file.

```
export LANG=en_US.UTF-8
export LANGUAGE=en_US.UTF-8
export LC_ALL=en_US.UTF-8
```

## To make the prerequisite setup in Mac some handy commands

Install Ruby Version Manager (rvm) and Ruby

```
$ brew install rvm
$ curl -sSL https://get.rvm.io | bash
$ rvm install ruby-2.6.0
```

Set path for rvm

```
export PATH="$PATH:$HOME/.rvm/bin"
source ~/.rvm/scripts/rvm
```

Set Ruby 2.6.0 as default and current

```
$ rvm list rubies
```

To Make as Default and Current Ruby Version

```
$ rvm --default use 2.6.0
```

Install CocoaPods and CocoaPods Generate Plugin

```
$ gem install cocoapods -v 1.11.2
$ gem install cocoapods-generate -v 2.2.2
```

To Build the App

```
$ ./gradlew :shared:podInstall
```
