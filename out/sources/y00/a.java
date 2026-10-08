package y00;

import android.util.Base64;
import java.util.concurrent.CancellationException;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ-\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00110\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00110\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J-\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00110\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Ly00/a;", "Liy/a;", "<init>", "()V", "Lry/b;", "flag", "", "j", "(Lry/b;)I", "Ldx/b;", "error", "Ldx/b$i;", "i", "(Ldx/b;)Ldx/b$i;", "", "data", "Ldx/i;", "", "h", "(Ljava/lang/String;Lry/b;)Ldx/i;", "b", "([BLry/b;)Ldx/i;", "Lry/a;", "g", "(Liy/b0;Lry/b;)Ldx/i;", "d", "([BLry/b;)Ljava/lang/String;", "security_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements iy.a {

    /* JADX INFO: renamed from: y00.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C5953a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f222625a;

        static {
            int[] iArr = new int[ry.b.values().length];
            try {
                iArr[ry.b.NO_WRAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ry.b.URL_SAFE_NO_PADDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ry.b.URL_SAFE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f222625a = iArr;
        }
    }

    private final dx.b.Parsing i(dx.b error) {
        return new dx.b.Parsing(new Exception("Failed to decode Base64, error: " + error));
    }

    private final int j(ry.b flag) {
        int i15 = C5953a.f222625a[flag.ordinal()];
        if (i15 == 1) {
            return 2;
        }
        if (i15 == 2) {
            return 11;
        }
        if (i15 == 3) {
            return 10;
        }
        throw new oq.p();
    }

    @Override // iy.a
    public dx.i<dx.b, byte[]> b(byte[] data, ry.b flag) {
        Object objB;
        dx.i<dx.b, byte[]> left;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    new ex.a();
                    left = new dx.i.Right<>(data == null ? new byte[0] : Base64.decode(data, j(flag)));
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                left = new dx.i.Left<>((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            px.f fVar = px.f.f163100a;
            String message = e18.getMessage();
            if (message == null) {
                message = "";
            }
            fVar.d(message, e18, px.c.a(jVarA));
            Object objA = jVarA.a(e18);
            if (objA instanceof dx.i.Left) {
                objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
            } else {
                if (!(objA instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                objB = ((dx.i.Right) objA).b();
            }
            left = new dx.i.Left(objB);
        }
        if (left instanceof dx.i.Left) {
            return new dx.i.Left(i((dx.b) ((dx.i.Left) left).b()));
        }
        if (left instanceof dx.i.Right) {
            return left;
        }
        throw new oq.p();
    }

    @Override // iy.a
    public String d(byte[] data, ry.b flag) {
        return Base64.encodeToString(data, j(flag));
    }

    @Override // iy.a
    public dx.i<dx.b, byte[]> g(iy.b0 data, ry.b flag) {
        return h(data != null ? iy.c0.e(data) : null, flag);
    }

    @Override // iy.a
    public dx.i<dx.b, byte[]> h(String data, ry.b flag) {
        Object objB;
        dx.i<dx.b, byte[]> left;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    new ex.a();
                    left = new dx.i.Right<>(data == null ? new byte[0] : Base64.decode(data, j(flag)));
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                left = new dx.i.Left<>((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            px.f fVar = px.f.f163100a;
            String message = e18.getMessage();
            if (message == null) {
                message = "";
            }
            fVar.d(message, e18, px.c.a(jVarA));
            Object objA = jVarA.a(e18);
            if (objA instanceof dx.i.Left) {
                objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
            } else {
                if (!(objA instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                objB = ((dx.i.Right) objA).b();
            }
            left = new dx.i.Left(objB);
        }
        if (left instanceof dx.i.Left) {
            return new dx.i.Left(i((dx.b) ((dx.i.Left) left).b()));
        }
        if (left instanceof dx.i.Right) {
            return left;
        }
        throw new oq.p();
    }
}
