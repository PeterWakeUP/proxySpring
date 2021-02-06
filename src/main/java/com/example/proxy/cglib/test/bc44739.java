package com.example.proxy.cglib.test;

import com.example.proxy.cglib.YunZhongYu;
import org.springframework.cglib.core.ReflectUtils;
import org.springframework.cglib.core.Signature;
import org.springframework.cglib.proxy.Callback;
import org.springframework.cglib.proxy.Factory;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * cglib动态代理生成的class
 */
public class bc44739 extends YunZhongYu implements Factory {
    private boolean CGLIB$BOUND;

    public static Object CGLIB$FACTORY_DATA;

    private static ThreadLocal CGLIB$THREAD_CALLBACKS;

    private static Callback[] CGLIB$STATIC_CALLBACKS;

    private MethodInterceptor CGLIB$CALLBACK_0;

    private static Object CGLIB$CALLBACK_FILTER;

    private static Method CGLIB$findLove$0$Method;

    private static MethodProxy CGLIB$findLove$0$Proxy;

    private static Object[] CGLIB$emptyArgs;

    private static Method CGLIB$say$1$Method;

    private static MethodProxy CGLIB$say$1$Proxy;

    private static Method CGLIB$equals$2$Method;

    private static MethodProxy CGLIB$equals$2$Proxy;

    private static Method CGLIB$toString$3$Method;

    private static MethodProxy CGLIB$toString$3$Proxy;

    private static Method CGLIB$hashCode$4$Method;

    private static MethodProxy CGLIB$hashCode$4$Proxy;

    private static Method CGLIB$clone$5$Method;

    private static MethodProxy CGLIB$clone$5$Proxy;

    public bc44739() {
        CGLIB$BIND_CALLBACKS(this);
    }

    public bc44739(MethodInterceptor methodInterceptor) {
        this.CGLIB$CALLBACK_0 = methodInterceptor;
        CGLIB$BIND_CALLBACKS(this);
    }

    static {
        try {
            CGLIB$STATICHOOK1();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public final boolean equals(Object paramObject) {
        try{
            if (this.CGLIB$CALLBACK_0 == null)
                CGLIB$BIND_CALLBACKS(this);
            if (this.CGLIB$CALLBACK_0 != null) {
                this.CGLIB$CALLBACK_0.intercept(this, CGLIB$equals$2$Method, new Object[] { paramObject }, CGLIB$equals$2$Proxy);
                return (this.CGLIB$CALLBACK_0.intercept(this, CGLIB$equals$2$Method, new Object[] { paramObject }, CGLIB$equals$2$Proxy) == null) ? false : ((Boolean)this.CGLIB$CALLBACK_0.intercept(this, CGLIB$equals$2$Method, new Object[] { paramObject }, CGLIB$equals$2$Proxy)).booleanValue();
            }
            return super.equals(paramObject);
        }catch (Throwable t){
            return false;
        }
    }

    public final String toString() {
        try{
            if (this.CGLIB$CALLBACK_0 == null)
                CGLIB$BIND_CALLBACKS(this);
            return (this.CGLIB$CALLBACK_0 != null) ? (String)this.CGLIB$CALLBACK_0.intercept(this, CGLIB$toString$3$Method, CGLIB$emptyArgs, CGLIB$toString$3$Proxy) : super.toString();
        }catch (Throwable t){
            return null;
        }
    }

    public final int hashCode() {
        if (this.CGLIB$CALLBACK_0 == null)
            CGLIB$BIND_CALLBACKS(this);
        if (this.CGLIB$CALLBACK_0 != null) {
            try{
                this.CGLIB$CALLBACK_0.intercept(this, CGLIB$hashCode$4$Method, CGLIB$emptyArgs, CGLIB$hashCode$4$Proxy);
                return (this.CGLIB$CALLBACK_0.intercept(this, CGLIB$hashCode$4$Method, CGLIB$emptyArgs, CGLIB$hashCode$4$Proxy) == null) ? 0 : ((Number)this.CGLIB$CALLBACK_0.intercept(this, CGLIB$hashCode$4$Method, CGLIB$emptyArgs, CGLIB$hashCode$4$Proxy)).intValue();
            }catch (Throwable t){

            }
        }
        return super.hashCode();
    }

    protected final Object clone() throws CloneNotSupportedException {
        try{
            if (this.CGLIB$CALLBACK_0 == null)
                CGLIB$BIND_CALLBACKS(this);
            return (this.CGLIB$CALLBACK_0 != null) ? this.CGLIB$CALLBACK_0.intercept(this, CGLIB$clone$5$Method, CGLIB$emptyArgs, CGLIB$clone$5$Proxy) : super.clone();
        }catch (Throwable t){
            return null;
        }

    }

    public Object newInstance(Class[] paramArrayOfClass, Object[] paramArrayOfObject, Callback[] paramArrayOfCallback) {
        return null;
        // Byte code:
        //   0: aload_3
        //   1: invokestatic CGLIB$SET_THREAD_CALLBACKS : ([Lorg/springframework/cglib/proxy/Callback;)V
        //   4: new com/example/proxy/cglib/YunZhongYu$$EnhancerByCGLIB$$7bc44739
        //   7: dup
        //   8: aload_1
        //   9: dup
        //   10: arraylength
        //   11: tableswitch default -> 35, 0 -> 28
        //   28: pop
        //   29: invokespecial <init> : ()V
        //   32: goto -> 49
        //   35: goto -> 38
        //   38: pop
        //   39: new java/lang/IllegalArgumentException
        //   42: dup
        //   43: ldc 'Constructor not found'
        //   45: invokespecial <init> : (Ljava/lang/String;)V
        //   48: athrow
        //   49: aconst_null
        //   50: invokestatic CGLIB$SET_THREAD_CALLBACKS : ([Lorg/springframework/cglib/proxy/Callback;)V
        //   53: areturn
    }

    public Object newInstance(Callback paramCallback) {
        CGLIB$SET_THREAD_CALLBACKS(new Callback[] { paramCallback });
        CGLIB$SET_THREAD_CALLBACKS(null);
        return new bc44739();
    }

    public Object newInstance(Callback[] paramArrayOfCallback) {
        CGLIB$SET_THREAD_CALLBACKS(paramArrayOfCallback);
        CGLIB$SET_THREAD_CALLBACKS(null);
        return new bc44739();
    }

    public final void findLove() {
        /*if (this.CGLIB$CALLBACK_0 == null)
            CGLIB$BIND_CALLBACKS(this);
        if (this.CGLIB$CALLBACK_0 != null)
            return;
        super.findLove();*/
        try{
            this.CGLIB$CALLBACK_0.intercept(this, CGLIB$findLove$0$Method, CGLIB$emptyArgs, CGLIB$findLove$0$Proxy);
        }catch (Throwable t){

        }
    }

    public final void say() {
        /*if (this.CGLIB$CALLBACK_0 == null)
            CGLIB$BIND_CALLBACKS(this);
        if (this.CGLIB$CALLBACK_0 != null)
            return;
        super.say();*/
        try{
            this.CGLIB$CALLBACK_0.intercept(this, CGLIB$say$1$Method, CGLIB$emptyArgs, CGLIB$say$1$Proxy);
        }catch (Throwable t){

        }
    }

    public void setCallback(int paramInt, Callback paramCallback) {
        switch (paramInt) {
            case 0:
                this.CGLIB$CALLBACK_0 = (MethodInterceptor)paramCallback;
                break;
        }
    }

    public void setCallbacks(Callback[] paramArrayOfCallback) {
        this.CGLIB$CALLBACK_0 = (MethodInterceptor)paramArrayOfCallback[0];
    }

    public static void CGLIB$SET_STATIC_CALLBACKS(Callback[] paramArrayOfCallback) {
        CGLIB$STATIC_CALLBACKS = paramArrayOfCallback;
    }

    public static void CGLIB$SET_THREAD_CALLBACKS(Callback[] paramArrayOfCallback) {
        CGLIB$THREAD_CALLBACKS.set(paramArrayOfCallback);
    }

    public Callback[] getCallbacks() {
        CGLIB$BIND_CALLBACKS(this);
        return new Callback[] { (Callback)this.CGLIB$CALLBACK_0 };
    }

    public Callback getCallback(int paramInt) {
        CGLIB$BIND_CALLBACKS(this);
        switch (paramInt) {
            case 0:

        }
        return null;
    }

    private static final void CGLIB$BIND_CALLBACKS(Object paramObject) {
        bc44739 bc447391 = (bc44739)paramObject;
        if (!bc447391.CGLIB$BOUND) {
            bc447391.CGLIB$BOUND = true;
            if (CGLIB$THREAD_CALLBACKS.get() == null) {
                CGLIB$THREAD_CALLBACKS.get();
                if (CGLIB$STATIC_CALLBACKS == null)
                    return;
            }
            bc447391.CGLIB$CALLBACK_0 = (MethodInterceptor)((Callback[])CGLIB$THREAD_CALLBACKS.get())[0];
        }
    }

    static void CGLIB$STATICHOOK1() throws ClassNotFoundException {
        CGLIB$THREAD_CALLBACKS = new ThreadLocal();
        CGLIB$emptyArgs = new Object[0];
        Class clazz1 = Class.forName("com.example.proxy.cglib.YunZhongYu$$EnhancerByCGLIB$$7bc44739");
        Class clazz2;
        CGLIB$equals$2$Method = ReflectUtils.findMethods(new String[] { "equals", "(Ljava/lang/Object;)Z", "toString", "()Ljava/lang/String;", "hashCode", "()I", "clone", "()Ljava/lang/Object;" }, (clazz2 = Class.forName("java.lang.Object")).getDeclaredMethods())[0];
        CGLIB$equals$2$Proxy = MethodProxy.create(clazz2, clazz1, "(Ljava/lang/Object;)Z", "equals", "CGLIB$equals$2");
        CGLIB$toString$3$Method = ReflectUtils.findMethods(new String[] { "equals", "(Ljava/lang/Object;)Z", "toString", "()Ljava/lang/String;", "hashCode", "()I", "clone", "()Ljava/lang/Object;" }, (clazz2 = Class.forName("java.lang.Object")).getDeclaredMethods())[1];
        CGLIB$toString$3$Proxy = MethodProxy.create(clazz2, clazz1, "()Ljava/lang/String;", "toString", "CGLIB$toString$3");
        CGLIB$hashCode$4$Method = ReflectUtils.findMethods(new String[] { "equals", "(Ljava/lang/Object;)Z", "toString", "()Ljava/lang/String;", "hashCode", "()I", "clone", "()Ljava/lang/Object;" }, (clazz2 = Class.forName("java.lang.Object")).getDeclaredMethods())[2];
        CGLIB$hashCode$4$Proxy = MethodProxy.create(clazz2, clazz1, "()I", "hashCode", "CGLIB$hashCode$4");
        CGLIB$clone$5$Method = ReflectUtils.findMethods(new String[] { "equals", "(Ljava/lang/Object;)Z", "toString", "()Ljava/lang/String;", "hashCode", "()I", "clone", "()Ljava/lang/Object;" }, (clazz2 = Class.forName("java.lang.Object")).getDeclaredMethods())[3];
        CGLIB$clone$5$Proxy = MethodProxy.create(clazz2, clazz1, "()Ljava/lang/Object;", "clone", "CGLIB$clone$5");
        ReflectUtils.findMethods(new String[] { "equals", "(Ljava/lang/Object;)Z", "toString", "()Ljava/lang/String;", "hashCode", "()I", "clone", "()Ljava/lang/Object;" }, (clazz2 = Class.forName("java.lang.Object")).getDeclaredMethods());
        CGLIB$findLove$0$Method = ReflectUtils.findMethods(new String[] { "findLove", "()V", "say", "()V" }, (clazz2 = Class.forName("com.example.proxy.cglib.YunZhongYu")).getDeclaredMethods())[0];
        CGLIB$findLove$0$Proxy = MethodProxy.create(clazz2, clazz1, "()V", "findLove", "CGLIB$findLove$0");
        CGLIB$say$1$Method = ReflectUtils.findMethods(new String[] { "findLove", "()V", "say", "()V" }, (clazz2 = Class.forName("com.example.proxy.cglib.YunZhongYu")).getDeclaredMethods())[1];
        CGLIB$say$1$Proxy = MethodProxy.create(clazz2, clazz1, "()V", "say", "CGLIB$say$1");
        ReflectUtils.findMethods(new String[] { "findLove", "()V", "say", "()V" }, (clazz2 = Class.forName("com.example.proxy.cglib.YunZhongYu")).getDeclaredMethods());
    }

    public static MethodProxy CGLIB$findMethodProxy(Signature paramSignature) {
        return null;
        // Byte code:
        //   0: aload_0
        //   1: invokevirtual toString : ()Ljava/lang/String;
        //   4: dup
        //   5: invokevirtual hashCode : ()I
        //   8: lookupswitch default -> 140, -909388886 -> 68, -508378822 -> 80, 1192015562 -> 92, 1826985398 -> 104, 1913648695 -> 116, 1984935277 -> 128
        //   68: ldc 'say()V'
        //   70: invokevirtual equals : (Ljava/lang/Object;)Z
        //   73: ifeq -> 141
        //   76: getstatic com/example/proxy/cglib/YunZhongYu$$EnhancerByCGLIB$$7bc44739.CGLIB$say$1$Proxy : Lorg/springframework/cglib/proxy/MethodProxy;
        //   79: areturn
        //   80: ldc 'clone()Ljava/lang/Object;'
        //   82: invokevirtual equals : (Ljava/lang/Object;)Z
        //   85: ifeq -> 141
        //   88: getstatic com/example/proxy/cglib/YunZhongYu$$EnhancerByCGLIB$$7bc44739.CGLIB$clone$5$Proxy : Lorg/springframework/cglib/proxy/MethodProxy;
        //   91: areturn
        //   92: ldc 'findLove()V'
        //   94: invokevirtual equals : (Ljava/lang/Object;)Z
        //   97: ifeq -> 141
        //   100: getstatic com/example/proxy/cglib/YunZhongYu$$EnhancerByCGLIB$$7bc44739.CGLIB$findLove$0$Proxy : Lorg/springframework/cglib/proxy/MethodProxy;
        //   103: areturn
        //   104: ldc 'equals(Ljava/lang/Object;)Z'
        //   106: invokevirtual equals : (Ljava/lang/Object;)Z
        //   109: ifeq -> 141
        //   112: getstatic com/example/proxy/cglib/YunZhongYu$$EnhancerByCGLIB$$7bc44739.CGLIB$equals$2$Proxy : Lorg/springframework/cglib/proxy/MethodProxy;
        //   115: areturn
        //   116: ldc 'toString()Ljava/lang/String;'
        //   118: invokevirtual equals : (Ljava/lang/Object;)Z
        //   121: ifeq -> 141
        //   124: getstatic com/example/proxy/cglib/YunZhongYu$$EnhancerByCGLIB$$7bc44739.CGLIB$toString$3$Proxy : Lorg/springframework/cglib/proxy/MethodProxy;
        //   127: areturn
        //   128: ldc 'hashCode()I'
        //   130: invokevirtual equals : (Ljava/lang/Object;)Z
        //   133: ifeq -> 141
        //   136: getstatic com/example/proxy/cglib/YunZhongYu$$EnhancerByCGLIB$$7bc44739.CGLIB$hashCode$4$Proxy : Lorg/springframework/cglib/proxy/MethodProxy;
        //   139: areturn
        //   140: pop
        //   141: aconst_null
        //   142: areturn
    }

    final int CGLIB$hashCode$4() {
        return super.hashCode();
    }

    final void CGLIB$say$1() {
        super.say();
    }

    final String CGLIB$toString$3() {
        return super.toString();
    }

    final boolean CGLIB$equals$2(Object paramObject) {
        return super.equals(paramObject);
    }

    final Object CGLIB$clone$5() throws CloneNotSupportedException {
        return super.clone();
    }

    final void CGLIB$findLove$0() {
        super.findLove();
    }
}

