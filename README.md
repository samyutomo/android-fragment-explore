<!-- THE SHIELDS -->
[![Forks][forks-shield]][forks-url]
[![Stargazers][stars-shield]][stars-url]

# Exploration of Fragment in Android
It's time to build a simple Android project and get started with a topic of Fragment.

## Background  

```txt
   if we want to code two different screens... 
      should we go for:
          Activity to Activity 
      or 
          Fragment to Fragment?
```
When Android was first released in 2008, Activity used as a screen to hold all UI views that the user interacts with. If we wanted two different screens, **_the usual way was to have two activities_**.

Beginning of Android 3.0 in 2011, Android was optimized to support a tablet which have wider screen than a phone. **_Fragment was introduced to fulfill for the need of tablet_**. A fragment represents a modular portion of the user interface within an activity and can manage its own layout, has its own lifecycle as well as handle its own input events. **_Fragment introduces modularity and reusability into our activity’s UI by allowing us to divide the UI into discrete chunks_**.

Consider an app that responds to various screen sizes. On larger screens, the app should display a static navigation drawer and a list in a grid layout. On smaller screens, the app should display a bottom navigation bar and a list in a linear layout. Managing all of these variations in the activity can be unwieldy. **_Separating the navigation elements from the content can make this process more manageable. The activity is then responsible for displaying the correct navigation UI while the fragment displays the list with the proper layout_**.
<br/>
<br/>
<br/>

[![Fragment UI][fragment-illustration]](misc/fragment-illustration.png)

<img src="misc/fragment-action.gif" width="1530" />


<p align="center"><i>illustration of Fragment UI</i></p>

<br/>

Dividing our UI into fragments makes it easier to modify our activity's appearance at runtime. While our activity is in the `STARTED` lifecycle state or higher, fragments can be added, replaced, or removed. We can keep a record of these changes in a back stack that is managed by the activity, allowing the changes to be reversed. **_However, fragments can't live on their own they must be hosted by an activity or another fragment_**.
<br/>
<br/>
>For more documentation and resources related to Android fragments, you can follow Android [Fragment Documentation](https://developer.android.com/guide/fragments/), which explains all about Fragment references.
>
>If you want to try building your first Android fragment by following Android documentation, start [Creating your Fragment here](https://developer.android.com/guide/fragments/create/)!  
>This documentation describes how to create a fragment and include it in an activity.
<br/>

## Video for further learning
[Single Activity: Why, When, and How (Android Dev Summit ‘18)](https://www.youtube.com/watch?v=2k8x8V77CrU)

[Fragments: Past, Present, and Future (Android Dev Summit '19)](https://www.youtube.com/watch?v=RS1IACnZLy4)
<br/>
<br/>

Thank you,  
*Samy Utomo* :smile: :thumbsup:


<!-- THE LINKS -->
[forks-shield]: https://img.shields.io/github/forks/samyutomo/android-fragment-explore?color=brightgreen&style=for-the-badge
[forks-url]: https://github.com/samyutomo/android-fragment-explore/network/members
[stars-shield]: https://img.shields.io/github/stars/samyutomo/android-fragment-explore?color=yellow&style=for-the-badge
[stars-url]: https://github.com/samyutomo/android-fragment-explore/stargazers
[fragment-illustration]: misc/fragment-illustration.png
[fragment-animate]: misc/fragment-action.gif
