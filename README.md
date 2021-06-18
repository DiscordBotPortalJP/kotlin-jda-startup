# kotlin-jda-startup
HerokuでKotlin/JDAを始めるテンプレート

# Usage

### Create app
Visit [Heroku DashBoard](https://dashboard.heroku.com/new-app) and create new app with name you like.

### Set Discord Token on Heroku app
`app page` > `Setting` > `Config Vars` > `Reveal Config Vars`
KEY: `Discord_Bot_Token`
VALUE: Your discord bot token
click `Add`

### Deploy

At first, create your own repository from `Use this template` and note the name.

After that `app page` > `Deploy` > `Deployment method` > Click `GitHub`.

Input your repo name on the field in `Connect to GitHub` section to search, then click `connect`.

Make sure your branch was certainly.

Click `Enable Automatic Deploy` and `Deploy Branch`.

After few minutes, your bot will be active.
