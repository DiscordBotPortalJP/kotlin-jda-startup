import net.dv8tion.jda.api.*
import net.dv8tion.jda.api.events.ReadyEvent
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent
import net.dv8tion.jda.api.hooks.ListenerAdapter
import net.dv8tion.jda.api.requests.GatewayIntent

class BotClient : ListenerAdapter(){
    lateinit var jda: JDA
    
    fun main(token: String) {
        jda = JDABuilder.createDefault(token,
            GatewayIntent.GUILD_MESSAGES)
            .addEventListeners(this)
            .build()
    }
    
    override fun onReady(event : ReadyEvent) {
        println("ready!")
    }
    
    override fun onGuildMessageReceived(event : GuildMessageReceivedEvent) {
        println("message received")
        if(event.message.contentDisplay == "/ping"){
            event.channel.sendMessageFormat("pong").queue()
        }
    }
}

fun main() {
    val token = System.getenv("Discord_Bot_Token")
    val bot = BotClient()
    bot.main(token)
}