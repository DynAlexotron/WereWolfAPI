package fr.ph1lou.werewolfapi.events.roles.bonesetter;

import fr.ph1lou.werewolfapi.events.roles.SelectionEvent;
import fr.ph1lou.werewolfapi.player.interfaces.IPlayerWW;

public class BonesetterHealEvent extends SelectionEvent {
    public BonesetterHealEvent(IPlayerWW playerWW, IPlayerWW targetWW) {
        super(playerWW, targetWW);
    }
}
