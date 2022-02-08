package com.rm.quicknotes

class Greeting {
  fun greeting(): String {
    return "Hello, ${Platform().platform}!"
  }
}