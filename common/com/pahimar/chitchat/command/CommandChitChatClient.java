package com.pahimar.chitchat.command;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;

import com.pahimar.chitchat.lib.Reference;

// TODO Complete client side commands
public class CommandChitChatClient extends CommandBase {

    @Override
    public String getCommandName() {

        return Reference.MOD_NAME.toLowerCase() + "-client";
    }

    @Override
    public String getCommandUsage(ICommandSender icommandsender) {

        return null;
    }

    @Override
    public void processCommand(ICommandSender commandSender, String[] args) {

    }

    @Override
    @SuppressWarnings("rawtypes")
    public List addTabCompletionOptions(ICommandSender commandSender, String[] args) {

        return new ArrayList();
    }
}
