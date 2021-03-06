package net.pottercraft.Ollivanders2.Spell;

import java.util.List;

import net.pottercraft.Ollivanders2.*;
import net.pottercraft.Ollivanders2.Effect.O2Effect;
import net.pottercraft.Ollivanders2.Player.O2Player;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;

/**
 * Created by Azami7 on 6/28/17.
 *
 * Turn target player in to a Creature.
 *
 * @author Azami7
 */
@Deprecated
public abstract class IncarnatioSuper extends Transfiguration
{
   O2Effect effect;

   public IncarnatioSuper () {}

   public IncarnatioSuper(Ollivanders2 plugin, Player player, Spells name, Double rightWand)
   {
      super(plugin, player, name, rightWand);
   }

   public void checkEffect()
   {
      move();
      List<LivingEntity> living = getLivingEntities(2);
      for (LivingEntity live : living)
      {
         if (live instanceof Player)
         {
            Player player = (Player)live;
            O2Player o2p = p.getO2Player(player);
            effect.duration = (int)(usesModifier*1200);
            o2p.addEffect(effect);
            p.setO2Player(player, o2p);
            kill();
         }
      }
   }
}
