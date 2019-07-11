# Mobile_Challenge
:octocat: GitHub Api using Retrofit in Android

# Description
Implementation of a small app that list  the most :star: starred :octocat: Github repos that were created in the last 30 days by fetching  sorted JSON data directly from the Github API using Retrofit2 .

:link:
:pushpin:
:file_folder:





## Prerequisites
:blush: :wink:

## Screenshots


<img  align="left" src="https://github.com/leylaBenAissaoui/Mobile_Challenge/blob/master/Asset/loading.gif" width="156" height="256" title="loading" hspace="20">
<img align="left" src="https://github.com/leylaBenAissaoui/Mobile_Challenge/blob/master/Asset/pagination.gif" width="156" height="256" title="pagination" hspace="20">
<img align="left" src="https://github.com/leylaBenAissaoui/Mobile_Challenge/blob/master/Asset/bottomNav.gif" width="156" height="256" title="bottom Navigation" hspace="20">
<img  align="left" src="https://github.com/leylaBenAissaoui/Mobile_Challenge/blob/master/Asset/viewPager.gif" width="156" height="256" title="viewPager" hspace="20">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

 ## If you are interested by the result , have a look below :point_down: 
  
  ##
  First of all , in this project we opted for the MVVM architecture
  
  >  ## What is MVVM? 
>  Model-View-ViewModel architecture consists of 3 parts.
>  * ***The View*** gets user’s actions and sends to the ViewModel, or listens
> live data stream from the ViewModel and provides to the users.
> *  ***The  ViewModel*** gets user’s actions from the View or provides data to View.
>  * ***The Model*** abstracts the data source. View and ViewModel uses that on
> data stream.

  <p align="center">
  <img  align="center" src="https://github.com/leylaBenAissaoui/Mobile_Challenge/blob/master/Asset/Architecture.png" width="500" height="500" ></p>
 
  
  
## Features



## libraries
```
    //For Navigation
    implementation 'com.google.android.material:material:1.0.0'
    
    //glide for loading images
    implementation 'com.github.bumptech.glide:glide:4.8.0'
    annotationProcessor 'com.github.bumptech.glide:compiler:4.8.0'
    
    //retrofit for API Calls
    implementation 'com.squareup.retrofit2:retrofit:2.5.0'
    implementation 'com.squareup.retrofit2:converter-gson:2.5.0'
    
    // lifecycle (ViewModel and LiveData) for observing data
    implementation "android.arch.lifecycle:extensions:1.1.1"
    
   // for animated svg
    implementation  "com.jaredrummler:animated-svg-view:1.0.6"
    
    // viewpager to ensure horizontal navigation 
    implementation "androidx.viewpager:viewpager:1.0.0"

```



## test 

<script src="https://gist.github.com/leylaBenAissaoui/0485c55215752b7f85ee2c74bb654768.js"></script>


