import geb.Browser

class Draft {
    def url
    String[][] picks
    Draft() {
        picks = new String[3][120]
    }
}
Browser.drive {
    int pack;
    int player;
    int pick;
    def draft = new Draft();
    int i;
    /*
    for (pack=1; pack<4; pack++) {
        i = 0;
        for (pick=1; pick<16; pick++) {
            for (player=1; player<9; player++) {
                go baseURL+"&player="+player+"&pack="+pack+"&pick="+pick+"&showpick=true"
                draft.picks[pack-1][i] = $(".pickedcarddiv .cardlink img").@src;
                i++;
            }
        }
    }
    def builder = new groovy.json.JsonBuilder()
    def root = builder.picks {
        data draft.picks
    }
    output = builder.toString();
      */
    output = '{"picks":{"data":[["http://www.wizards.com/global/images/magic/m14/serra_angel.jpg","http://www.wizards.com/global/images/magic/m14/serra_angel.jpg","http://www.wizards.com/global/images/magic/m14/scavenging_ooze.jpg","http://www.wizards.com/global/images/magic/m14/domestication.jpg","http://www.wizards.com/global/images/magic/m14/water_servant.jpg","http://www.wizards.com/global/images/magic/m14/fiendslayer_paladin.jpg","http://www.wizards.com/global/images/magic/m14/claustrophobia.jpg","http://www.wizards.com/global/images/magic/m14/air_servant.jpg","http://www.wizards.com/global/images/magic/m14/pacifism.jpg","http://www.wizards.com/global/images/magic/m14/charging_griffin.jpg","http://www.wizards.com/global/images/magic/m14/battle_sliver.jpg","http://www.wizards.com/global/images/magic/m14/quag_sickness.jpg","http://www.wizards.com/global/images/magic/m14/disperse.jpg","http://www.wizards.com/global/images/magic/m14/master_of_diversion.jpg","http://www.wizards.com/global/images/magic/m14/enlarge.jpg","http://www.wizards.com/global/images/magic/m14/messenger_drake.jpg","http://www.wizards.com/global/images/magic/m14/banisher_priest.jpg","http://www.wizards.com/global/images/magic/m14/clone.jpg","http://www.wizards.com/global/images/magic/m14/woodborn_behemoth.jpg","http://www.wizards.com/global/images/magic/m14/liturgy_of_blood.jpg","http://www.wizards.com/global/images/magic/m14/seacoast_drake.jpg","http://www.wizards.com/global/images/magic/m14/sentinel_sliver.jpg","http://www.wizards.com/global/images/magic/m14/act_of_treason.jpg","http://www.wizards.com/global/images/magic/m14/blightcaster.jpg","http://www.wizards.com/global/images/magic/m14/master_of_diversion.jpg","http://www.wizards.com/global/images/magic/m14/shock.jpg","http://www.wizards.com/global/images/magic/m14/volcanic_geyser.jpg","http://www.wizards.com/global/images/magic/m14/giant_spider.jpg","http://www.wizards.com/global/images/magic/m14/path_of_bravery.jpg","http://www.wizards.com/global/images/magic/m14/child_of_night.jpg","http://www.wizards.com/global/images/magic/m14/marauding_maulhorn.jpg","http://www.wizards.com/global/images/magic/m14/divination.jpg","http://www.wizards.com/global/images/magic/m14/deathgaze_cockatrice.jpg","http://www.wizards.com/global/images/magic/m14/time_ebb.jpg","http://www.wizards.com/global/images/magic/m14/wild_ricochet.jpg","http://www.wizards.com/global/images/magic/m14/predatory_sliver.jpg","http://www.wizards.com/global/images/magic/m14/frost_breath.jpg","http://www.wizards.com/global/images/magic/m14/sentinel_sliver.jpg","http://www.wizards.com/global/images/magic/m14/bubbling_cauldron.jpg","http://www.wizards.com/global/images/magic/m14/lightning_talons.jpg","http://www.wizards.com/global/images/magic/m14/nightwing_shade.jpg","http://www.wizards.com/global/images/magic/m14/pillarfield_ox.jpg","http://www.wizards.com/global/images/magic/m14/pitchburn_devils.jpg","http://www.wizards.com/global/images/magic/m14/deathgaze_cockatrice.jpg","http://www.wizards.com/global/images/magic/m14/capashen_knight.jpg","http://www.wizards.com/global/images/magic/m14/dark_favor.jpg","http://www.wizards.com/global/images/magic/m14/vampire_warlord.jpg","http://www.wizards.com/global/images/magic/m14/barrage_of_expendables.jpg","http://www.wizards.com/global/images/magic/m14/vampire_warlord.jpg","http://www.wizards.com/global/images/magic/m14/act_of_treason.jpg","http://www.wizards.com/global/images/magic/m14/festering_newt.jpg","http://www.wizards.com/global/images/magic/m14/messenger_drake.jpg","http://www.wizards.com/global/images/magic/m14/nightwing_shade.jpg","http://www.wizards.com/global/images/magic/m14/mark_of_the_vampire.jpg","http://www.wizards.com/global/images/magic/m14/undead_minotaur.jpg","http://www.wizards.com/global/images/magic/m14/wring_flesh.jpg","http://www.wizards.com/global/images/magic/m14/altars_reap.jpg","http://www.wizards.com/global/images/magic/m14/solemn_offering.jpg","http://www.wizards.com/global/images/magic/m14/giant_growth.jpg","http://www.wizards.com/global/images/magic/m14/wring_flesh.jpg","http://www.wizards.com/global/images/magic/m14/festering_newt.jpg","http://www.wizards.com/global/images/magic/m14/blood_bairn.jpg","http://www.wizards.com/global/images/magic/m14/regathan_firecat.jpg","http://www.wizards.com/global/images/magic/m14/minotaur_abomination.jpg","http://www.wizards.com/global/images/magic/m14/plummet.jpg","http://www.wizards.com/global/images/magic/m14/dragon_hatchling.jpg","http://www.wizards.com/global/images/magic/m14/giant_spider.jpg","http://www.wizards.com/global/images/magic/m14/tenacious_dead.jpg","http://www.wizards.com/global/images/magic/m14/pay_no_heed.jpg","http://www.wizards.com/global/images/magic/m14/auramancer.jpg","http://www.wizards.com/global/images/magic/m14/regathan_firecat.jpg","http://www.wizards.com/global/images/magic/m14/blur_sliver.jpg","http://www.wizards.com/global/images/magic/m14/wall_of_swords.jpg","http://www.wizards.com/global/images/magic/m14/seismic_stomp.jpg","http://www.wizards.com/global/images/magic/m14/lava_axe.jpg","http://www.wizards.com/global/images/magic/m14/fog.jpg","http://www.wizards.com/global/images/magic/m14/giant_spider.jpg","http://www.wizards.com/global/images/magic/m14/blessing.jpg","http://www.wizards.com/global/images/magic/m14/thunder_strike.jpg","http://www.wizards.com/global/images/magic/m14/shimmering_grotto.jpg","http://www.wizards.com/global/images/magic/m14/cancel.jpg","http://www.wizards.com/global/images/magic/m14/solemn_offering.jpg","http://www.wizards.com/global/images/magic/m14/groundshaker_sliver.jpg","http://www.wizards.com/global/images/magic/m14/verdant_haven.jpg","http://www.wizards.com/global/images/magic/m14/angelic_favor.jpg","http://www.wizards.com/global/images/magic/m14/frost_breath.jpg","http://www.wizards.com/global/images/magic/m14/accorders_shield.jpg","http://www.wizards.com/global/images/magic/m14/sliver_construct.jpg","http://www.wizards.com/global/images/magic/m14/siege_mastodon.jpg","http://www.wizards.com/global/images/magic/m14/pillarfield_ox.jpg","http://www.wizards.com/global/images/magic/m14/brindle_boar.jpg","http://www.wizards.com/global/images/magic/m14/silence.jpg","http://www.wizards.com/global/images/magic/m14/gladecover_scout.jpg","http://www.wizards.com/global/images/magic/m14/dark_favor.jpg","http://www.wizards.com/global/images/magic/m14/fleshpulper_giant.jpg","http://www.wizards.com/global/images/magic/m14/wild_guess.jpg","http://www.wizards.com/global/images/magic/m14/indestructibility.jpg","http://www.wizards.com/global/images/magic/m14/smelt.jpg","http://www.wizards.com/global/images/magic/m14/fog.jpg","http://www.wizards.com/global/images/magic/m14/undead_minotaur.jpg","http://www.wizards.com/global/images/magic/m14/tome_scour.jpg","http://www.wizards.com/global/images/magic/m14/shadowborn_apostle.jpg","http://www.wizards.com/global/images/magic/m14/angelic_wall.jpg","http://www.wizards.com/global/images/magic/m14/glimpse_the_future.jpg","http://www.wizards.com/global/images/magic/m14/shadowborn_apostle.jpg","http://www.wizards.com/global/images/magic/m14/seismic_stomp.jpg","http://www.wizards.com/global/images/magic/m14/staff_of_the_flame_magus.jpg","http://www.wizards.com/global/images/magic/m14/artificers_hex.jpg","http://www.wizards.com/global/images/magic/m14/merfolk_spy.jpg","http://www.wizards.com/global/images/magic/m14/staff_of_the_sun_magus.jpg","http://www.wizards.com/global/images/magic/m14/merfolk_spy.jpg","http://www.wizards.com/global/images/magic/m14/gladecover_scout.jpg","http://www.wizards.com/global/images/magic/m14/forest.jpg","http://www.wizards.com/global/images/magic/m14/swamp.jpg","http://www.wizards.com/global/images/magic/m14/island.jpg","http://www.wizards.com/global/images/magic/m14/mountain.jpg","http://www.wizards.com/global/images/magic/m14/plains.jpg","http://www.wizards.com/global/images/magic/m14/forest.jpg","http://www.wizards.com/global/images/magic/m14/mountain.jpg","http://www.wizards.com/global/images/magic/m14/plains.jpg",null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null],["http://www.wizards.com/global/images/magic/m14/accursed_spirit.jpg","http://www.wizards.com/global/images/magic/m14/opportunity.jpg","http://www.wizards.com/global/images/magic/m14/chandras_outrage.jpg","http://www.wizards.com/global/images/magic/m14/essence_scatter.jpg","http://www.wizards.com/global/images/magic/m14/archangel_of_thune.jpg","http://www.wizards.com/global/images/magic/m14/serra_angel.jpg","http://www.wizards.com/global/images/magic/m14/flames_of_the_firebrand.jpg","http://www.wizards.com/global/images/magic/m14/quag_sickness.jpg","http://www.wizards.com/global/images/magic/m14/master_of_diversion.jpg","http://www.wizards.com/global/images/magic/m14/nephalia_seakite.jpg","http://www.wizards.com/global/images/magic/m14/ogre_battledriver.jpg","http://www.wizards.com/global/images/magic/m14/briarpack_alpha.jpg","http://www.wizards.com/global/images/magic/m14/messenger_drake.jpg","http://www.wizards.com/global/images/magic/m14/master_of_diversion.jpg","http://www.wizards.com/global/images/magic/m14/flames_of_the_firebrand.jpg","http://www.wizards.com/global/images/magic/m14/opportunity.jpg","http://www.wizards.com/global/images/magic/m14/bubbling_cauldron.jpg","http://www.wizards.com/global/images/magic/m14/disperse.jpg","http://www.wizards.com/global/images/magic/m14/marauding_maulhorn.jpg","http://www.wizards.com/global/images/magic/m14/elvish_mystic.jpg","http://www.wizards.com/global/images/magic/m14/tidebinder_mage.jpg","http://www.wizards.com/global/images/magic/m14/megantic_sliver.jpg","http://www.wizards.com/global/images/magic/m14/young_pyromancer.jpg","http://www.wizards.com/global/images/magic/m14/bogbrew_witch.jpg","http://www.wizards.com/global/images/magic/m14/charging_griffin.jpg","http://www.wizards.com/global/images/magic/m14/disperse.jpg","http://www.wizards.com/global/images/magic/m14/deadly_recluse.jpg","http://www.wizards.com/global/images/magic/m14/tenacious_dead.jpg","http://www.wizards.com/global/images/magic/m14/illusionary_armor.jpg","http://www.wizards.com/global/images/magic/m14/celestial_flare.jpg","http://www.wizards.com/global/images/magic/m14/kalonian_tusker.jpg","http://www.wizards.com/global/images/magic/m14/wall_of_frost.jpg","http://www.wizards.com/global/images/magic/m14/sentinel_sliver.jpg","http://www.wizards.com/global/images/magic/m14/coral_merfolk.jpg","http://www.wizards.com/global/images/magic/m14/disperse.jpg","http://www.wizards.com/global/images/magic/m14/giant_spider.jpg","http://www.wizards.com/global/images/magic/m14/auramancer.jpg","http://www.wizards.com/global/images/magic/m14/charging_griffin.jpg","http://www.wizards.com/global/images/magic/m14/goblin_diplomats.jpg","http://www.wizards.com/global/images/magic/m14/frost_breath.jpg","http://www.wizards.com/global/images/magic/m14/mind_rot.jpg","http://www.wizards.com/global/images/magic/m14/divination.jpg","http://www.wizards.com/global/images/magic/m14/striking_sliver.jpg","http://www.wizards.com/global/images/magic/m14/vastwood_hydra.jpg","http://www.wizards.com/global/images/magic/m14/nephalia_seakite.jpg","http://www.wizards.com/global/images/magic/m14/dark_favor.jpg","http://www.wizards.com/global/images/magic/m14/rumbling_baloth.jpg","http://www.wizards.com/global/images/magic/m14/sliver_construct.jpg","http://www.wizards.com/global/images/magic/m14/charging_griffin.jpg","http://www.wizards.com/global/images/magic/m14/seacoast_drake.jpg","http://www.wizards.com/global/images/magic/m14/manaweft_sliver.jpg","http://www.wizards.com/global/images/magic/m14/hunt_the_weak.jpg","http://www.wizards.com/global/images/magic/m14/scroll_thief.jpg","http://www.wizards.com/global/images/magic/m14/nightwing_shade.jpg","http://www.wizards.com/global/images/magic/m14/regathan_firecat.jpg","http://www.wizards.com/global/images/magic/m14/vampire_warlord.jpg","http://www.wizards.com/global/images/magic/m14/divine_favor.jpg","http://www.wizards.com/global/images/magic/m14/trained_condor.jpg","http://www.wizards.com/global/images/magic/m14/plummet.jpg","http://www.wizards.com/global/images/magic/m14/elvish_mystic.jpg","http://www.wizards.com/global/images/magic/m14/shivs_embrace.jpg","http://www.wizards.com/global/images/magic/m14/nightwing_shade.jpg","http://www.wizards.com/global/images/magic/m14/pitchburn_devils.jpg","http://www.wizards.com/global/images/magic/m14/festering_newt.jpg","http://www.wizards.com/global/images/magic/m14/sentinel_sliver.jpg","http://www.wizards.com/global/images/magic/m14/disperse.jpg","http://www.wizards.com/global/images/magic/m14/goblin_shortcutter.jpg","http://www.wizards.com/global/images/magic/m14/undead_minotaur.jpg","http://www.wizards.com/global/images/magic/m14/auramancer.jpg","http://www.wizards.com/global/images/magic/m14/show_of_valor.jpg","http://www.wizards.com/global/images/magic/m14/dragon_egg.jpg","http://www.wizards.com/global/images/magic/m14/coral_merfolk.jpg","http://www.wizards.com/global/images/magic/m14/congregate.jpg","http://www.wizards.com/global/images/magic/m14/hive_stirrings.jpg","http://www.wizards.com/global/images/magic/m14/lava_axe.jpg","http://www.wizards.com/global/images/magic/m14/trollhide.jpg","http://www.wizards.com/global/images/magic/m14/hunt_the_weak.jpg","http://www.wizards.com/global/images/magic/m14/dawnstrike_paladin.jpg","http://www.wizards.com/global/images/magic/m14/naturalize.jpg","http://www.wizards.com/global/images/magic/m14/altars_reap.jpg","http://www.wizards.com/global/images/magic/m14/pitchburn_devils.jpg","http://www.wizards.com/global/images/magic/m14/blessing.jpg","http://www.wizards.com/global/images/magic/m14/bramblecrush.jpg","http://www.wizards.com/global/images/magic/m14/bramblecrush.jpg","http://www.wizards.com/global/images/magic/m14/nightwing_shade.jpg","http://www.wizards.com/global/images/magic/m14/solemn_offering.jpg","http://www.wizards.com/global/images/magic/m14/dragon_hatchling.jpg","http://www.wizards.com/global/images/magic/m14/vile_rebirth.jpg","http://www.wizards.com/global/images/magic/m14/groundshaker_sliver.jpg","http://www.wizards.com/global/images/magic/m14/steelform_sliver.jpg","http://www.wizards.com/global/images/magic/m14/academy_raider.jpg","http://www.wizards.com/global/images/magic/m14/seismic_stomp.jpg","http://www.wizards.com/global/images/magic/m14/armored_cancrix.jpg","http://www.wizards.com/global/images/magic/m14/frost_breath.jpg","http://www.wizards.com/global/images/magic/m14/undead_minotaur.jpg","http://www.wizards.com/global/images/magic/m14/mind_rot.jpg","http://www.wizards.com/global/images/magic/m14/pay_no_heed.jpg","http://www.wizards.com/global/images/magic/m14/hive_stirrings.jpg","http://www.wizards.com/global/images/magic/m14/canyon_minotaur.jpg","http://www.wizards.com/global/images/magic/m14/elixir_of_immortality.jpg","http://www.wizards.com/global/images/magic/m14/lightning_talons.jpg","http://www.wizards.com/global/images/magic/m14/pay_no_heed.jpg","http://www.wizards.com/global/images/magic/m14/verdant_haven.jpg","http://www.wizards.com/global/images/magic/m14/vial_of_poison.jpg","http://www.wizards.com/global/images/magic/m14/oath_of_the_ancient_wood.jpg","http://www.wizards.com/global/images/magic/m14/armored_cancrix.jpg","http://www.wizards.com/global/images/magic/m14/negate.jpg","http://www.wizards.com/global/images/magic/m14/gladecover_scout.jpg","http://www.wizards.com/global/images/magic/m14/frost_breath.jpg","http://www.wizards.com/global/images/magic/m14/staff_of_the_wild_magus.jpg","http://www.wizards.com/global/images/magic/m14/seismic_stomp.jpg","http://www.wizards.com/global/images/magic/m14/shadowborn_apostle.jpg","http://www.wizards.com/global/images/magic/m14/mountain.jpg","http://www.wizards.com/global/images/magic/m14/island.jpg","http://www.wizards.com/global/images/magic/m14/island.jpg","http://www.wizards.com/global/images/magic/m14/forest.jpg","http://www.wizards.com/global/images/magic/m14/forest.jpg","http://www.wizards.com/global/images/magic/m14/mountain.jpg","http://www.wizards.com/global/images/magic/m14/swamp.jpg","http://www.wizards.com/global/images/magic/m14/plains.jpg",null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null],["http://www.wizards.com/global/images/magic/m14/child_of_night.jpg","http://www.wizards.com/global/images/magic/m14/air_servant.jpg","http://www.wizards.com/global/images/magic/m14/kalonian_tusker.jpg","http://www.wizards.com/global/images/magic/m14/sengir_vampire.jpg","http://www.wizards.com/global/images/magic/m14/serra_angel.jpg","http://www.wizards.com/global/images/magic/m14/ajani_caller_of_the_pride.jpg","http://www.wizards.com/global/images/magic/m14/marauding_maulhorn.jpg","http://www.wizards.com/global/images/magic/m14/claustrophobia.jpg","http://www.wizards.com/global/images/magic/m14/quag_sickness.jpg","http://www.wizards.com/global/images/magic/m14/nephalia_seakite.jpg","http://www.wizards.com/global/images/magic/m14/advocate_of_the_beast.jpg","http://www.wizards.com/global/images/magic/m14/child_of_night.jpg","http://www.wizards.com/global/images/magic/m14/jace_memory_adept.jpg","http://www.wizards.com/global/images/magic/m14/master_of_diversion.jpg","http://www.wizards.com/global/images/magic/m14/chandras_outrage.jpg","http://www.wizards.com/global/images/magic/m14/claustrophobia.jpg","http://www.wizards.com/global/images/magic/m14/liturgy_of_blood.jpg","http://www.wizards.com/global/images/magic/m14/water_servant.jpg","http://www.wizards.com/global/images/magic/m14/young_pyromancer.jpg","http://www.wizards.com/global/images/magic/m14/altars_reap.jpg","http://www.wizards.com/global/images/magic/m14/opportunity.jpg","http://www.wizards.com/global/images/magic/m14/sentinel_sliver.jpg","http://www.wizards.com/global/images/magic/m14/shock.jpg","http://www.wizards.com/global/images/magic/m14/child_of_night.jpg","http://www.wizards.com/global/images/magic/m14/auramancer.jpg","http://www.wizards.com/global/images/magic/m14/warden_of_evos_isle.jpg","http://www.wizards.com/global/images/magic/m14/advocate_of_the_beast.jpg","http://www.wizards.com/global/images/magic/m14/vastwood_hydra.jpg","http://www.wizards.com/global/images/magic/m14/windreader_sphinx.jpg","http://www.wizards.com/global/images/magic/m14/air_servant.jpg","http://www.wizards.com/global/images/magic/m14/gnawing_zombie.jpg","http://www.wizards.com/global/images/magic/m14/messenger_drake.jpg","http://www.wizards.com/global/images/magic/m14/nightwing_shade.jpg","http://www.wizards.com/global/images/magic/m14/angelic_wall.jpg","http://www.wizards.com/global/images/magic/m14/witchstalker.jpg","http://www.wizards.com/global/images/magic/m14/voracious_wurm.jpg","http://www.wizards.com/global/images/magic/m14/sensory_deprivation.jpg","http://www.wizards.com/global/images/magic/m14/corpse_hauler.jpg","http://www.wizards.com/global/images/magic/m14/dark_favor.jpg","http://www.wizards.com/global/images/magic/m14/coral_merfolk.jpg","http://www.wizards.com/global/images/magic/m14/accursed_spirit.jpg","http://www.wizards.com/global/images/magic/m14/time_ebb.jpg","http://www.wizards.com/global/images/magic/m14/sporemound.jpg","http://www.wizards.com/global/images/magic/m14/vampire_warlord.jpg","http://www.wizards.com/global/images/magic/m14/siege_mastodon.jpg","http://www.wizards.com/global/images/magic/m14/capashen_knight.jpg","http://www.wizards.com/global/images/magic/m14/dragon_egg.jpg","http://www.wizards.com/global/images/magic/m14/messenger_drake.jpg","http://www.wizards.com/global/images/magic/m14/angelic_wall.jpg","http://www.wizards.com/global/images/magic/m14/wall_of_swords.jpg","http://www.wizards.com/global/images/magic/m14/basking_rootwala.jpg","http://www.wizards.com/global/images/magic/m14/deathgaze_cockatrice.jpg","http://www.wizards.com/global/images/magic/m14/nephalia_seakite.jpg","http://www.wizards.com/global/images/magic/m14/scroll_thief.jpg","http://www.wizards.com/global/images/magic/m14/hunt_the_weak.jpg","http://www.wizards.com/global/images/magic/m14/festering_newt.jpg","http://www.wizards.com/global/images/magic/m14/scroll_thief.jpg","http://www.wizards.com/global/images/magic/m14/show_of_valor.jpg","http://www.wizards.com/global/images/magic/m14/elvish_mystic.jpg","http://www.wizards.com/global/images/magic/m14/giant_growth.jpg","http://www.wizards.com/global/images/magic/m14/act_of_treason.jpg","http://www.wizards.com/global/images/magic/m14/seacoast_drake.jpg","http://www.wizards.com/global/images/magic/m14/academy_raider.jpg","http://www.wizards.com/global/images/magic/m14/negate.jpg","http://www.wizards.com/global/images/magic/m14/darksteel_ingot.jpg","http://www.wizards.com/global/images/magic/m14/siege_mastodon.jpg","http://www.wizards.com/global/images/magic/m14/thunder_strike.jpg","http://www.wizards.com/global/images/magic/m14/duress.jpg","http://www.wizards.com/global/images/magic/m14/woodborn_behemoth.jpg","http://www.wizards.com/global/images/magic/m14/wring_flesh.jpg","http://www.wizards.com/global/images/magic/m14/goblin_shortcutter.jpg","http://www.wizards.com/global/images/magic/m14/verdant_haven.jpg","http://www.wizards.com/global/images/magic/m14/sliver_construct.jpg","http://www.wizards.com/global/images/magic/m14/cancel.jpg","http://www.wizards.com/global/images/magic/m14/lava_axe.jpg","http://www.wizards.com/global/images/magic/m14/guardian_of_the_ages.jpg","http://www.wizards.com/global/images/magic/m14/hive_stirrings.jpg","http://www.wizards.com/global/images/magic/m14/pillarfield_ox.jpg","http://www.wizards.com/global/images/magic/m14/congregate.jpg","http://www.wizards.com/global/images/magic/m14/predatory_sliver.jpg","http://www.wizards.com/global/images/magic/m14/divine_favor.jpg","http://www.wizards.com/global/images/magic/m14/darksteel_forge.jpg","http://www.wizards.com/global/images/magic/m14/thunder_strike.jpg","http://www.wizards.com/global/images/magic/m14/millstone.jpg","http://www.wizards.com/global/images/magic/m14/sliver_construct.jpg","http://www.wizards.com/global/images/magic/m14/mind_rot.jpg","http://www.wizards.com/global/images/magic/m14/wild_ricochet.jpg","http://www.wizards.com/global/images/magic/m14/shimmering_grotto.jpg","http://www.wizards.com/global/images/magic/m14/verdant_haven.jpg","http://www.wizards.com/global/images/magic/m14/sporemound.jpg","http://www.wizards.com/global/images/magic/m14/demolish.jpg","http://www.wizards.com/global/images/magic/m14/minotaur_abomination.jpg","http://www.wizards.com/global/images/magic/m14/hive_stirrings.jpg","http://www.wizards.com/global/images/magic/m14/fog.jpg","http://www.wizards.com/global/images/magic/m14/academy_raider.jpg","http://www.wizards.com/global/images/magic/m14/thunder_strike.jpg","http://www.wizards.com/global/images/magic/m14/staff_of_the_sun_magus.jpg","http://www.wizards.com/global/images/magic/m14/spell_blast.jpg","http://www.wizards.com/global/images/magic/m14/lightning_talons.jpg","http://www.wizards.com/global/images/magic/m14/soulmender.jpg","http://www.wizards.com/global/images/magic/m14/spell_blast.jpg","http://www.wizards.com/global/images/magic/m14/suntail_hawk.jpg","http://www.wizards.com/global/images/magic/m14/demolish.jpg","http://www.wizards.com/global/images/magic/m14/frost_breath.jpg","http://www.wizards.com/global/images/magic/m14/lava_axe.jpg","http://www.wizards.com/global/images/magic/m14/shadowborn_apostle.jpg","http://www.wizards.com/global/images/magic/m14/fog.jpg","http://www.wizards.com/global/images/magic/m14/bubbling_cauldron.jpg","http://www.wizards.com/global/images/magic/m14/staff_of_the_flame_magus.jpg","http://www.wizards.com/global/images/magic/m14/lay_of_the_land.jpg","http://www.wizards.com/global/images/magic/m14/dragon_hatchling.jpg","http://www.wizards.com/global/images/magic/m14/verdant_haven.jpg","http://www.wizards.com/global/images/magic/m14/island.jpg","http://www.wizards.com/global/images/magic/m14/island.jpg","http://www.wizards.com/global/images/magic/m14/island.jpg","http://www.wizards.com/global/images/magic/m14/plains.jpg","http://www.wizards.com/global/images/magic/m14/forest.jpg","http://www.wizards.com/global/images/magic/m14/island.jpg","http://www.wizards.com/global/images/magic/m14/forest.jpg","http://www.wizards.com/global/images/magic/m14/plains.jpg"]]}}'

}.quit()