package com.example.proxy.jdk.test;

import com.example.proxy.jdk.Person;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.UndeclaredThrowableException;

public final class Proxy0 extends Proxy implements Person {
    private static Method m1;

    private static Method m3;

    private static Method m2;

    private static Method m4;

    private static Method m0;

    public Proxy0(InvocationHandler paramInvocationHandler) {
        super(paramInvocationHandler);
    }

    static {
        try {
            m1 = Class.forName("java.lang.Object").getMethod("equals", new Class[] { Class.forName("java.lang.Object") });
            m3 = Class.forName("com.example.proxy.jdk.Person").getMethod("findLove", new Class[0]);
            m2 = Class.forName("java.lang.Object").getMethod("toString", new Class[0]);
            m4 = Class.forName("com.example.proxy.jdk.Person").getMethod("say", new Class[0]);
            m0 = Class.forName("java.lang.Object").getMethod("hashCode", new Class[0]);
        } catch (NoSuchMethodException noSuchMethodException) {
            throw new NoSuchMethodError(noSuchMethodException.getMessage());
        } catch (ClassNotFoundException classNotFoundException) {
            throw new NoClassDefFoundError(classNotFoundException.getMessage());
        }
    }

    public final boolean equals(Object paramObject) {
        try {
            return ((Boolean)this.h.invoke(this, m1, new Object[] { paramObject })).booleanValue();
        } catch (Error|RuntimeException error) {
            throw null;
        } catch (Throwable throwable) {
            throw new UndeclaredThrowableException(throwable);
        }
    }

    public final String toString() {
        try {
            return (String)this.h.invoke(this, m2, null);
        } catch (Error|RuntimeException error) {
            throw null;
        } catch (Throwable throwable) {
            throw new UndeclaredThrowableException(throwable);
        }
    }

    public final int hashCode() {
        try {
            return ((Integer)this.h.invoke(this, m0, null)).intValue();
        } catch (Error|RuntimeException error) {
            throw null;
        } catch (Throwable throwable) {
            throw new UndeclaredThrowableException(throwable);
        }
    }

    public final void findLove() {
        try {
            this.h.invoke(this, m3, null);
            return;
        } catch (Error|RuntimeException error) {
            throw null;
        } catch (Throwable throwable) {
            throw new UndeclaredThrowableException(throwable);
        }
    }

    public final void say() {
        try {
            this.h.invoke(this, m4, null);
            return;
        } catch (Error|RuntimeException error) {
            throw null;
        } catch (Throwable throwable) {
            throw new UndeclaredThrowableException(throwable);
        }
    }
}

