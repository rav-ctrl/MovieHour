# THE MOVIE HOUR APP
#### _Powered by_  Android Jetpack

[![N|Solid](https://www.cleveroad.com/images/article-previews/android-jetpack.png)](https://nodesource.com/products/nsolid)

## Features
MovieHour is an Android Application that tells you what movie to watch tonight
- Uses TMDB database API
- New movies every day
- Ranking based on popularity

## Tech

MovieHour uses a number of open source projects and library to work properly:

- [Kotlin] - HTML enhanced for web apps!
- [MVVM Architecture] - awesome web-based text editor
- [Jetpack Lib] - Markdown parser done right. Fast and easy to extend.
- [Kotlin Coroutines] - great UI boilerplate for modern web apps
- [Room Database] - evented I/O for the backend
- [Retrofit] - fast node.js network app framework

## Contribution process
* Contribute your code in the branch 'master'. It will give us a better chance to test your code before merging it with stable code.
* For your first contribution start a pull request on master.


### Fork and download android repository:
* Please follow [SETUP.md](https://github.com/nextcloud/android/blob/master/SETUP.md) to setup Nextcloud Android app work environment.


### Create pull request:
* Commit your changes locally: ```git commit -a```
* Push your changes to your GitHub repo: ```git push```
* Browse to <https://github.com/ctrl-rav/android/pulls> and issue pull request
* Enter description and send pull request.


### Create another pull request:
To make sure your new pull request does not contain commits which are already contained in previous PRs, create a new branch which is a clone of upstream/master.

* ```git fetch upstream```
* ```git checkout -b my_new_master_branch upstream/master```
* If you want to rename that branch later: ```git checkout -b my_new_master_branch_with_new_name```
* Push branch to server: ```git push -u origin name_of_local_master_branch```
* Use GitHub to issue PR

### Pull requests that also need changes on library
For speeding up developing, we do use a master snapshot of nextcloud-library, provided by jitpack.io.
This means that if a breaking change is merged on library, master branch of the app will fail.
To limit this risk please follow this approach:
- on app PR: first use a reference to your library branch in build.gradle: ext -> androidLibraryVersion, e.g. androidLibraryVersion = "changeSearch-SNAPSHOT"
- on library PR: use label "client change required" to indicate that this is breaking change. This will prevent GitHub from merging it.

Once both PRs are reviewed and ready to merge:
- on library PR: remove label and merge it (for a short time now master cannot be built!)
- on app PR: change androidLibraryVersion back to "master-SNAPSHOT"
- wait for CI and then merge

## License

Apache License

[//]: # (These are reference links used in the body of this note and get stripped out when the markdown processor does its job. There is no need to format nicely because it shouldn't be seen. Thanks SO - http://stackoverflow.com/questions/4823468/store-comments-in-markdown-syntax)

   [Kotlin]: <https://kotlinlang.org/>
   [MVVM Architecture]: <https://developer.android.com/jetpack/guide>
   [Jetpack Lib]: <https://developer.android.com/jetpack>
   [Kotlin Coroutines]: <https://github.com/Kotlin/kotlinx.coroutines>
   [Room Database]: <https://developer.android.com/training/data-storage/room>
   [Retrofit]: <https://square.github.io/retrofit/>
