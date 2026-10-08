package org.conscrypt.metrics;

import org.conscrypt.Platform;

/* JADX INFO: loaded from: classes5.dex */
public class ReflexiveStatsEvent {
    private static final Class<?> c_statsEvent;
    private static final OptionalMethod newBuilder;
    private static final boolean sdkVersionBiggerThan32;
    private final Object statsEvent;

    public static final class Builder {
        private static final OptionalMethod build;
        private static final Class<?> c_statsEvent_Builder;
        private static final OptionalMethod setAtomId;
        private static final OptionalMethod usePooledBuffer;
        private static final OptionalMethod writeBoolean;
        private static final OptionalMethod writeInt;
        private static final OptionalMethod writeIntArray;
        private final Object builder;

        static {
            Class<?> clsInitStatsEventBuilderClass = initStatsEventBuilderClass();
            c_statsEvent_Builder = clsInitStatsEventBuilderClass;
            Class cls = Integer.TYPE;
            setAtomId = new OptionalMethod(clsInitStatsEventBuilderClass, "setAtomId", cls);
            writeBoolean = new OptionalMethod(clsInitStatsEventBuilderClass, "writeBoolean", Boolean.TYPE);
            writeInt = new OptionalMethod(clsInitStatsEventBuilderClass, "writeInt", cls);
            build = new OptionalMethod(clsInitStatsEventBuilderClass, "build", new Class[0]);
            usePooledBuffer = new OptionalMethod(clsInitStatsEventBuilderClass, "usePooledBuffer", new Class[0]);
            writeIntArray = new OptionalMethod(clsInitStatsEventBuilderClass, "writeIntArray", int[].class);
        }

        private static Class<?> initStatsEventBuilderClass() {
            try {
                return Class.forName("android.util.StatsEvent$Builder");
            } catch (ClassNotFoundException unused) {
                return null;
            }
        }

        public ReflexiveStatsEvent build() {
            return new ReflexiveStatsEvent(build.invoke(this.builder, new Object[0]));
        }

        public Builder setAtomId(int i15) {
            setAtomId.invoke(this.builder, Integer.valueOf(i15));
            return this;
        }

        public void usePooledBuffer() {
            usePooledBuffer.invoke(this.builder, new Object[0]);
        }

        public Builder writeBoolean(boolean z15) {
            writeBoolean.invoke(this.builder, Boolean.valueOf(z15));
            return this;
        }

        public Builder writeInt(int i15) {
            writeInt.invoke(this.builder, Integer.valueOf(i15));
            return this;
        }

        public Builder writeIntArray(int[] iArr) {
            if (ReflexiveStatsEvent.sdkVersionBiggerThan32) {
                writeIntArray.invoke(this.builder, iArr);
            }
            return this;
        }

        private Builder() {
            this.builder = ReflexiveStatsEvent.newBuilder.invokeStatic(new Object[0]);
        }
    }

    static {
        Class<?> clsInitStatsEventClass = initStatsEventClass();
        c_statsEvent = clsInitStatsEventClass;
        newBuilder = new OptionalMethod(clsInitStatsEventClass, "newBuilder", new Class[0]);
        sdkVersionBiggerThan32 = Platform.isSdkGreater(32);
    }

    @Deprecated
    public static ReflexiveStatsEvent buildEvent(int i15, boolean z15, int i16, int i17, int i18, int i19, int[] iArr) {
        Builder builderNewBuilder = newBuilder();
        builderNewBuilder.setAtomId(i15);
        builderNewBuilder.writeBoolean(z15);
        builderNewBuilder.writeInt(i16);
        builderNewBuilder.writeInt(i17);
        builderNewBuilder.writeInt(i18);
        builderNewBuilder.writeInt(i19);
        builderNewBuilder.writeIntArray(iArr);
        builderNewBuilder.usePooledBuffer();
        return builderNewBuilder.build();
    }

    private static Class<?> initStatsEventClass() {
        try {
            return Class.forName("android.util.StatsEvent");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Object getStatsEvent() {
        return this.statsEvent;
    }

    private ReflexiveStatsEvent(Object obj) {
        this.statsEvent = obj;
    }

    @Deprecated
    public static ReflexiveStatsEvent buildEvent(int i15, boolean z15, int i16, int i17, int i18, int i19) {
        Builder builderNewBuilder = newBuilder();
        builderNewBuilder.setAtomId(i15);
        builderNewBuilder.writeBoolean(z15);
        builderNewBuilder.writeInt(i16);
        builderNewBuilder.writeInt(i17);
        builderNewBuilder.writeInt(i18);
        builderNewBuilder.writeInt(i19);
        builderNewBuilder.usePooledBuffer();
        return builderNewBuilder.build();
    }
}
