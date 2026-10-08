package u0;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aC\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\f\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\u000b\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\f\u0010\r\u001a3\u0010\u0013\u001a\u00020\u0012\"\b\b\u0000\u0010\u0001*\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014\"\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017\"\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\"\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lu0/t;", "V", "Lu0/t3;", "", "playTimeMillis", "start", "end", "startVelocity", "g", "(Lu0/t3;JLu0/t;Lu0/t;Lu0/t;)Lu0/t;", "Lu0/w3;", "playTime", "e", "(Lu0/w3;J)J", "visibilityThreshold", "", "dampingRatio", "stiffness", "Lu0/v;", "f", "(Lu0/t;FF)Lu0/v;", "", "a", "[I", "EmptyIntArray", "", "b", "[F", "EmptyFloatArray", "Lu0/y;", "c", "Lu0/y;", "EmptyArcSpline", "animation-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class u3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f193902a = new int[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float[] f193903b = new float[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final y f193904c = new y(new int[2], new float[2], new float[][]{new float[2], new float[2]});

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\b¨\u0006\n"}, d2 = {"u0/u3$a", "Lu0/v;", "", "index", "Lu0/n0;", "a", "(I)Lu0/n0;", "", "[Lu0/n0;", "anims", "animation-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements v {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final n0[] anims;

        /* JADX WARN: Incorrect types in method signature: (TV;FF)V */
        a(t tVar, float f15, float f16) {
            int size = tVar.getSize();
            n0[] n0VarArr = new n0[size];
            for (int i15 = 0; i15 < size; i15++) {
                n0VarArr[i15] = new n0(f15, f16, tVar.a(i15));
            }
            this.anims = n0VarArr;
        }

        @Override // u0.v
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public n0 get(int index) {
            return this.anims[index];
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007¨\u0006\t"}, d2 = {"u0/u3$b", "Lu0/v;", "", "index", "Lu0/n0;", "a", "(I)Lu0/n0;", "Lu0/n0;", "anim", "animation-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements v {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final n0 anim;

        b(float f15, float f16) {
            this.anim = new n0(f15, f16, 0.0f, 4, null);
        }

        @Override // u0.v
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public n0 get(int index) {
            return this.anim;
        }
    }

    public static final long e(w3<?> w3Var, long j15) {
        long delayMillis = j15 - ((long) w3Var.getDelayMillis());
        long durationMillis = w3Var.getDurationMillis();
        if (delayMillis < 0) {
            delayMillis = 0;
        }
        return delayMillis > durationMillis ? durationMillis : delayMillis;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <V extends t> v f(V v15, float f15, float f16) {
        return v15 != null ? new a(v15, f15, f16) : new b(f15, f16);
    }

    public static final <V extends t> V g(t3<V> t3Var, long j15, V v15, V v16, V v17) {
        return (V) t3Var.g(j15 * 1000000, v15, v16, v17);
    }
}
