package zhang.hello_mod;

import net.minecraft.Util;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.UUID;

@Mod("hello_mod")
@Mod.EventBusSubscriber
public class Main {
    @SubscribeEvent
    public static void playerJoinWorld(PlayerEvent.PlayerLoggedInEvent event){
        Player player = event.getPlayer();
        Level level = player.level;
        player.sendMessage(new TextComponent("hi " + player.getDisplayName().getString() + ". from " + (level.isClientSide() ? "CLIENT" : "SERVER")), Util.NIL_UUID);
    }
}
