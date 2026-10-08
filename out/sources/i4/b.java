package i4;

import android.R;
import android.os.Build;
import f3.q;
import oq.p;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0010\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\f\u0010\nR\u0011\u0010\u000e\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\r\u0010\nj\u0002\b\u000fj\u0002\b\u0010j\u0002\b\tj\u0002\b\u0011j\u0002\b\f¨\u0006\u0012"}, d2 = {"Li4/b;", "", "", "id", "order", "<init>", "(Ljava/lang/String;III)V", "a", "I", "e", "()I", "b", "g", "j", "titleResource", "c", "d", "f", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum b {
    Copy(R.id.copy, 0),
    Paste(R.id.paste, 1),
    Cut(R.id.cut, 2),
    SelectAll(R.id.selectAll, 3),
    Autofill(R.id.autofill, 4);


    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ wq.a f89004j = wq.b.a(b());

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int order;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f89007a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.Copy.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.Paste.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.Cut.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b.SelectAll.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[b.Autofill.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f89007a = iArr;
        }
    }

    b(int i15, int i16) {
        this.id = i15;
        this.order = i16;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getOrder() {
        return this.order;
    }

    public final int j() {
        int i15 = a.f89007a[ordinal()];
        if (i15 == 1) {
            return R.string.copy;
        }
        if (i15 == 2) {
            return R.string.paste;
        }
        if (i15 == 3) {
            return R.string.cut;
        }
        if (i15 == 4) {
            return R.string.selectAll;
        }
        if (i15 == 5) {
            return Build.VERSION.SDK_INT <= 26 ? q.f58790a : R.string.autofill;
        }
        throw new p();
    }
}
