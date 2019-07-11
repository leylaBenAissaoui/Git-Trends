# Mobile_Challenge
:octocat: GitHub Api using Retrofit in Android :octocat:

# Description
Implementation of a small app that list  the most :star: starred :octocat: Github repos that were created in the last 30 days by fetching  sorted JSON data directly from the Github API using Retrofit2 .

 To do this:* <br />

 1. At the beginning, we have integrated recyclerView, to display the list of data
 2. After we added bottonvavigationView to navigate between the fragments.
 3. And we've even added a viewPager to make UserExperience more sophisticated.
 4. The last thing was to feed the list with real data received from the GitHub database using the Github API ***With the ability to keep scrolling and new results appear***



## Screenshots


<img  align="left" src="https://github.com/leylaBenAissaoui/Mobile_Challenge/blob/master/Asset/loading.gif" width="156" height="256" title="loading" hspace="20">
<img align="left" src="https://github.com/leylaBenAissaoui/Mobile_Challenge/blob/master/Asset/pagination.gif" width="156" height="256" title="pagination" hspace="20">
<img align="left" src="https://github.com/leylaBenAissaoui/Mobile_Challenge/blob/master/Asset/bottomNav.gif" width="156" height="256" title="bottom Navigation" hspace="20">
<img  align="left" src="https://github.com/leylaBenAissaoui/Mobile_Challenge/blob/master/Asset/viewPager.gif" width="156" height="256" title="viewPager" hspace="20">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

  **If you are interested by the result , have a look below** :point_down: 
 
 ## Run
**To run this project , just clone the repos and open it on Android Studio 3.3.2 or higher .**
   
  ## Architecture
  First of all , in this project we have opted for the MVVM architecture
  
  >  ## What is MVVM? 
>  Model-View-ViewModel architecture consists of 3 parts.
>  * ***The View*** gets user’s actions and sends to the ViewModel, or listens
> live data stream from the ViewModel and provides to the users.
> *  ***The  ViewModel*** gets user’s actions from the View or provides data to View.
>  * ***The Model*** abstracts the data source. View and ViewModel uses that on
> data stream.

  <p align="center">
  <img  align="center" src="https://github.com/leylaBenAissaoui/Mobile_Challenge/blob/master/Asset/Architecture.png" width="500" height="500" ></p>
 
  
  
## Project Structure
We have created packages by features. so the code  is more modular and easier to manage.

<p align="center">
  <img  align="center" src="https://github.com/leylaBenAissaoui/Mobile_Challenge/blob/master/Asset/projett.PNG" width="300" height="500"> </p>




## Libraries
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


You will find in this link all the [releases](https://github.com/leylaBenAissaoui/Mobile_Challenge/tags)

