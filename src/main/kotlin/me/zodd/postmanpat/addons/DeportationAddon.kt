package me.zodd.postmanpat.addons

import com.earth2me.essentials.User
import net.minecraftcitiesnetwork.deportation.DeportationPlugin

/** Queries Deportation 2.0's already-loaded cache without database I/O. */
class DeportationAddon(private val plugin: DeportationPlugin) {
    fun isDeported(user: User): Boolean = plugin.deportationService.isDeported(user.uuid)
}
