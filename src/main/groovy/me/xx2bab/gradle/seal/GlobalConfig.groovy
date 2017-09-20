package me.xx2bab.gradle.seal

import me.xx2bab.gradle.seal.node.AppAttrsExtension
import me.xx2bab.gradle.seal.replace.AppReplaceValuesExtension
import me.xx2bab.gradle.seal.xmlns.XmlnsSweepExtension;

/**
 * Created by 2bab
 */
class GlobalConfig {

    SealExtension plugin

    AppReplaceValuesExtension replace

    AppAttrsExtension remove

    XmlnsSweepExtension xmlns

}
