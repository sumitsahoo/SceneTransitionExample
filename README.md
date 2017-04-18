# Scene Transition Between Activities
Here's a quick demo on how to make a scene transition between two activities. Two activities must extent `AppCompatActivity` and the `View` must have same `transitionName`. `View` can have different IDs and properties. While starting the activity there's a slight change :

```
// Start detail activity with transition
// Transition name needs to be same on both the View to make the scene transition work across activities
// View ID can be different

ActivityOptionsCompat activityOptionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(MainActivity.this, imageViewRobot, context.getString(R.string.transition_name));
Intent intent = new Intent(MainActivity.this, DetailActivity.class);
ActivityCompat.startActivity(context, intent, activityOptionsCompat.toBundle());
```            

Screenshot :

<img src="https://github.com/sumitsahoo/SceneTransitionExample/blob/master/device-2017-04-18_2.gif" width="350"/>


That's it, easy isn't it ?

Happy Coding :)
