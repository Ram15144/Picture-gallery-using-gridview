# Picture-gallery-using-gridview

Android app that implements the following functionality. The main activity in the app displays a grid. Each grid cell contains a thumbnail picture of a car (from outside the car) above the name of the car’s manufacturer. For instance, a grid cell contains a thumbnail showing a Honda Civic, above the name “Honda”. The thumbnails are separated by thin spaces (no more than 5 dp) uniformly on all four sides when the grid is displayed on the android device. Also, the thumbnails are sized such that there will be 3 columns in portrait mode. Each grid cell supports two kinds of functionality, depending on whether an app viewer performs a short
vs. a long click on a cell. A short click brings up a new activity that shows the entire picture of the selected car on the entire device display. This picture must be a higher resolution and bigger than the thumbnail
displayed earlier. The user can return to the grid view by selecting the “back” soft button on the phone. However, if a user clicks on the displayed picture instead, you must open a browser activity showing the
web site of the car’s manufacturer. For instance, if your app shows a picture of a Honda Civic, the app brings up the Honda web page from the official Honda web site. A long click on a grid cell brings up a “context menu” showing the following three options for the car under consideration: 
(1) View the entire picture (similar to a short click); 
(2) Shows the official web page of the car manufacturer in a new activity; and 
(3) brings up a list containing the names and addresses of three car dealers for the selected manufacturer in greater Chicago area.
The gridview is designed in such a way that it will display optimally in portrait mode, and reasonably well also in
landscape mode.