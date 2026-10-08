package r;

import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.view.SurfaceHolder;
import androidx.camera.core.g;
import fr.k;
import fr.t;
import java.util.Iterator;
import o.j2;
import o.m1;
import o.t0;
import oq.p;
import p071kotlin.Metadata;
import v.d2;
import v.w3;
import v.x3;
import y.z;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0017\b\u0002\u0012\f\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u000bj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lr/c;", "", "Ljava/lang/Class;", "surfaceClass", "<init>", "(Ljava/lang/String;ILjava/lang/Class;)V", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/Class;", "e", "()Ljava/lang/Class;", "b", "c", "d", "f", "g", "h", "camera-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum c {
    PREVIEW(SurfaceHolder.class),
    IMAGE_CAPTURE(null),
    IMAGE_ANALYSIS(null),
    VIDEO_CAPTURE(MediaCodec.class),
    STREAM_SHARING(SurfaceTexture.class),
    UNDEFINED(null);


    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Class<?> surfaceClass;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final /* synthetic */ wq.a f169779k = wq.b.a(b());

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: r.c$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\n\u001a\u00020\u0007*\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\f\u001a\u00020\u0007*\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u0013\u0010\r\u001a\u00020\u0007*\u00020\u0005H\u0002¢\u0006\u0004\b\r\u0010\u000bJ\u0013\u0010\u000e\u001a\u00020\u0007*\u00020\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\u000bJ\u0013\u0010\u000f\u001a\u00020\u0007*\u00020\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\u000bJ\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\u0005H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u0010*\u0006\u0012\u0002\b\u00030\u0013H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0004*\u00020\u0005H\u0000¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lr/c$a;", "", "<init>", "()V", "Ls/b;", "Lo/j2;", "useCase", "", "d", "(Ls/b;Lo/j2;)Z", "e", "(Lo/j2;)Z", "f", "i", "g", "h", "Lr/c;", "b", "(Lo/j2;)Lr/c;", "Lv/w3;", "c", "(Lv/w3;)Lr/c;", "a", "(Lo/j2;)Ls/b;", "camera-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: r.c$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final /* synthetic */ class C4296a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f169781a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ int[] f169782b;

            static {
                int[] iArr = new int[x3.b.values().length];
                try {
                    iArr[x3.b.IMAGE_ANALYSIS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[x3.b.IMAGE_CAPTURE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[x3.b.PREVIEW.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[x3.b.VIDEO_CAPTURE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[x3.b.STREAM_SHARING.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f169781a = iArr;
                int[] iArr2 = new int[s.b.values().length];
                try {
                    iArr2[s.b.DYNAMIC_RANGE.ordinal()] = 1;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr2[s.b.FPS_RANGE.ordinal()] = 2;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr2[s.b.VIDEO_STABILIZATION.ordinal()] = 3;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr2[s.b.IMAGE_FORMAT.ordinal()] = 4;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr2[s.b.RECORDING_QUALITY.ordinal()] = 5;
                } catch (NoSuchFieldError unused10) {
                }
                f169782b = iArr2;
            }
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private final boolean d(s.b bVar, j2 j2Var) {
            int i15 = C4296a.f169782b[bVar.ordinal()];
            if (i15 == 1) {
                return e(j2Var);
            }
            if (i15 == 2) {
                return f(j2Var);
            }
            if (i15 == 3) {
                return i(j2Var);
            }
            if (i15 == 4) {
                return g(j2Var);
            }
            if (i15 == 5) {
                return h(j2Var);
            }
            throw new p();
        }

        private final boolean e(j2 j2Var) {
            return j2Var.e().N();
        }

        private final boolean f(j2 j2Var) {
            return j2Var.e().g0();
        }

        private final boolean g(j2 j2Var) {
            return j2Var.e().h(d2.W);
        }

        private final boolean h(j2 j2Var) {
            return t.c(j2Var.e().f(w3.O, Boolean.TRUE), Boolean.FALSE);
        }

        private final boolean i(j2 j2Var) {
            return j2Var.e().h(w3.M) || j2Var.e().h(w3.N);
        }

        public final s.b a(j2 j2Var) {
            s.b next;
            Iterator<s.b> it = s.b.e().iterator();
            while (it.hasNext()) {
                next = it.next();
                if (c.INSTANCE.d(next, j2Var)) {
                    return next;
                }
            }
            next = null;
            return next;
        }

        public final c b(j2 j2Var) {
            if (j2Var instanceof m1) {
                return c.PREVIEW;
            }
            if (j2Var instanceof t0) {
                return c.IMAGE_CAPTURE;
            }
            if (j2Var instanceof g) {
                return c.IMAGE_ANALYSIS;
            }
            if (z.h(j2Var)) {
                return c.VIDEO_CAPTURE;
            }
            return j2Var instanceof k0.g ? c.STREAM_SHARING : c.UNDEFINED;
        }

        public final c c(w3<?> w3Var) {
            int i15 = C4296a.f169781a[w3Var.W().ordinal()];
            if (i15 == 1) {
                return c.IMAGE_ANALYSIS;
            }
            if (i15 == 2) {
                return c.IMAGE_CAPTURE;
            }
            if (i15 == 3) {
                return c.PREVIEW;
            }
            if (i15 != 4) {
                return i15 != 5 ? c.UNDEFINED : c.STREAM_SHARING;
            }
            return c.VIDEO_CAPTURE;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f169783a;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.PREVIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.IMAGE_CAPTURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c.IMAGE_ANALYSIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[c.VIDEO_CAPTURE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[c.STREAM_SHARING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[c.UNDEFINED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f169783a = iArr;
        }
    }

    c(Class cls) {
        this.surfaceClass = cls;
    }

    public final Class<?> e() {
        return this.surfaceClass;
    }

    @Override // java.lang.Enum
    public String toString() {
        switch (b.f169783a[ordinal()]) {
            case 1:
                return "Preview";
            case 2:
                return "ImageCapture";
            case 3:
                return "ImageAnalysis";
            case 4:
                return "VideoCapture";
            case 5:
                return "StreamSharing";
            case 6:
                return "Undefined";
            default:
                throw new p();
        }
    }
}
