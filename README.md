## Milestone1

# CONConnect

### Table of Contents
1. Overview
2. Specs
3. Wireframe/Prototype

## **Overview**

#### *Description*
An application that helps users find conventions for special interests and hobbies (i.e. Anime, Video Games, Sci-Fi, etc.), with the added ability to *connect* and meet new people while attending a convention. The application will list several conventions based on the user's location and will include a search/sort feature to allow them to find conventions based on their interests. Furthermore, each individual convetion lisitng will contain relavent information about the con and will include a link to their respective official website.

#### *App Evaluation*
- **Category:** Social Networking/Event Tracking
- **Story:** Users are able to search for either local or domestic conventions for specific interest and hobbies (i.e. Anime, Gaming, Sci-Fi/Fantasy, etc.)
- **Market:** The products initial user base are those interested in Geek/Nerd Culture, but it will grow to a casual audience to those who enjoy or are interested in attending a convention
- **Habit:** The app can be used at any time of the year, as there would be consistent updates for conventions happening during the year and future con dates in case a user wants to plan a con visit in advance.
- **Scope:** The starting point would be the creation of a user profile and selecting various interests to create a short list of conventions matching the user's interests. The next part would be setting up the search/sort feature to give the user a wide range of convetions within their home state or in other states.

## **Product Specs**
### 1. User Stories

#### **Required**
- A new user creates their own account
- User sets their preferences (Location and Themes/Interests)
- The user selects a convention on their homepage from a recommendation list
- Convention Info Page
- Search Feature (search for conventions based on either user interests or selected filters)
- Settings (Change user info, themes/interests, or messaging settings)

#### **Optional**
- Social Media Integration (Discord, Twitter, Facebook, etc.)
- Chat Feature/Friend Adding
- Volunteer Interest Form
- Convention Updates

### 2. Screens

- Login
- New User Registration
- Home Menu
- User Profile
- Search Results
- Settings
- Chat/Messaging
- Convention Information

### 3. Navigation

#### **Tab Navigation**

- Home
- Profile
- Search
- Chat

#### *Optional:*

- Ticket Page
- Event Schedule
- Special Guest
- Venue Map

## Wireframes
![CONConnect_Wireframes1](https://user-images.githubusercontent.com/65150367/192707232-f986b391-b810-4968-b50d-aea808fea151.jpg)
![CONConnect_Wireframes2](https://user-images.githubusercontent.com/65150367/192707405-ab94706a-2ed3-495a-b359-04e0e202d233.jpg)

## Milestone 2 & 3
### Digital Wireframe & Mockups
![Figma Wireframes](https://user-images.githubusercontent.com/65150367/192934625-fbd8933e-a6c9-42ea-ac69-ba6796e79008.png)


### Interactive Prototype

![CONConnect](https://user-images.githubusercontent.com/65150367/195468920-015326a1-6bde-448c-b556-68b8fdbca875.gif)


https://www.figma.com/proto/wI0llMcIuDmOaKpv5tpJlh/CONConnect-Digital-Wireframe?page-id=0%3A1&node-id=12%3A617&viewport=-2100%2C535%2C0.8&scaling=contain&starting-point-node-id=12%3A537 

## Schema

### Models

| Property      | Type          | Description               |
| ------------- |---------------| -------------             |
| userId        | String        | Unique User Id Number     |
| username      | String        | Username Login Credential |
| password      | String        | Password Login Credential |
| birthday      | String        | User's Birthday           |
| Email         | String        | User's Email Address      |
| Location      | String        | User's Home Location      |
| Hobbies       | Array         | User Hobbies              |
| Destination   | String        | Address Search            |
| Type          | String        | Conference Type           |

### Networking

##### Lists of network requests by screen

* Feed/Home Screen
  * (Read/Get) - Conventional Programmes displays user interest
  * (Read/Get) - Programmes of user interest
  * (Read/Get) - Upcoming Programmes
  * (Read/Get) - Dates and Location
 
 * Setting Screen
   * (Get/Read) - change user information
   * (Get/Read) - change user interest
   * (Get/Read) - messages setting
   * (Update/Post) - update user information
   
 * ConConnect Screen
    * (Read/Get) - Programmes Post
    * (Read/Get) - Dates and Location for programmes
    * (Read/Get) - Past Programmes
    
 * Chats
    * (Create/Post) - New Chat created
    * (Delete) - delete previous chat
    * (Get/Read) - current chat
  
 An API for Conventional Programmes:
 
 * Base url - http://api.data.conconnect/ed/college

|   HTTP        | Character     | Description   |
| ------------- |---------------| ------------- |
|      Get      | User name     | get User Name |
|      Get      | Conference    | get conference|
|      Get      | String        | Return user   |
|     Post      | String        | upcoming confrerence|
| Delete       |String          | Previous conventions|
| Update      | String          | Delete past conventions|

***Please Watch Video For Current Progress***

https://user-images.githubusercontent.com/65150367/196852239-fbc36a03-e485-4d75-9b6e-ec1f81a92395.mp4

### Next Sprint Cycle ###

1. Convention Research
2. Flight Information
3. Hotel Information
4. User Stories Development

### Milestone 4

***Database***

![Milestone3 mp4](https://user-images.githubusercontent.com/99681937/202082680-2732ce7e-6615-4f52-b8db-70931fe4d1ca.gif)

N/A

### Milestone 5

Discussed Redesingn plans 

### Next Sprint Cycle ###

1. Database Creation
2. Wireframe Updates
3. User Stories Development


### Milestone 6

No Updates due to lack of team meetings. Team Meeting will be

### Next Sprint Cycle ###

1. **Multiple Team Meetings**
2. Begin Redesign of App
3. Decide on Color Scheme


### Milestone 7

Application Color Scheme
![AdobeColor-CONConnect 3](https://user-images.githubusercontent.com/65150367/202353843-b606c20b-f0c3-489a-86ef-cd11f4cff800.jpeg)
![AdobeColor-CONConnect 2](https://user-images.githubusercontent.com/65150367/202353857-cd14fc88-d41b-49f3-8184-1369c34e4a61.jpeg)
![AdobeColor-CONConnect 1](https://user-images.githubusercontent.com/65150367/202353877-d8badd6e-eab1-4863-af3e-97d5d1a85fc1.jpeg)

App Redesign of Wireframes

### Final Sprint ###

1. Connect Pages to Database
2. Final Deubbing
3. Creation of Video & Poster


### Final Sprint (2: Electric Boogaloo) ###

1. Create Code for Application
2. Connect Database
3. Test Application
  * Read Data
  *  Add New Data
  *  Delete Data
  *  Modify Data
