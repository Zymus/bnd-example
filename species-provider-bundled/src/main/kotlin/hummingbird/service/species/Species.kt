/* Species.kt
 * Copyright (C) 2018 Zymus
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
package hummingbird.service.species

import org.osgi.service.component.annotations.Component
import org.osgi.service.component.annotations.ConfigurationPolicy
import org.osgi.service.metatype.annotations.Designate

@Component(
	configurationPolicy = ConfigurationPolicy.REQUIRE,
	service = [Species::class]
)
@Designate(
	factory = true,
	ocd = SpeciesConfig::class
)
class Species {

	fun activate(config: SpeciesConfig) {
		System.out.println("Species.activate config: $config")
		System.out.flush()
	}
}
