package dev.bandb.graphview.sample.demo.graph

import dev.bandb.graphview.graph.Node

abstract class AbstractSceneNode(val id: String) : Node(Unit) {

    override fun toString(): String {
        return "AbstractSceneNode(id='$id')"
    }
}