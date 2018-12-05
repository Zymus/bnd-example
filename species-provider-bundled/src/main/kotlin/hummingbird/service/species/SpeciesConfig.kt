/* SpeciesConfig.kt
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

import org.osgi.service.metatype.annotations.ObjectClassDefinition

/**
 *
 * @since 0.0
 */
@ObjectClassDefinition
annotation class SpeciesConfig (

	/**
	 * Maps to the `SPECIES_NAME` property.
	 *
	 * The default value is the `DEFAULT_SPECIES_NAME` constant.
	 *
	 * @since 0.0
	 */
	val species_name: String = DEFAULT_SPECIES_NAME
)
