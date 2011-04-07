package com.magenta.guice.events;

import org.jetbrains.annotations.NotNull;

public interface EventMatcher<T> {
    /**
     * @param event �������
     *
     * @return true, ���� ������� ������ ���� ����������
     */
    boolean matches(@NotNull T event);
}

