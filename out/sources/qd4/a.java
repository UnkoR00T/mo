package qd4;

import android.content.Context;
import androidx.appcompat.app.c;
import androidx.fragment.app.o;
import oq.p;
import p071kotlin.Metadata;
import sh2.b;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0017¨\u0006\u0019"}, d2 = {"Lqd4/a;", "Lrh2/a;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lrh2/a$a;", "Lsh2/b;", "d", "(Lrh2/a$a;)Lsh2/b;", "Landroidx/fragment/app/o;", "fragment", "", "tag", "existingFragmentNavigation", "Loq/i0;", "b", "(Landroidx/fragment/app/o;Ljava/lang/String;Lrh2/a$a;)V", "c", "(Ljava/lang/String;)V", "a", "Landroid/content/Context;", "Landroidx/appcompat/app/c;", "Landroidx/appcompat/app/c;", "activity", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements rh2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final c activity;

    /* JADX INFO: renamed from: qd4.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C4160a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f166149a;

        static {
            int[] iArr = new int[rh2.a.EnumC4442a.values().length];
            try {
                iArr[rh2.a.EnumC4442a.POP_TO_EXISTING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[rh2.a.EnumC4442a.POP_TO_EXISTING_CLEAR_BACKSTACK_WHEN_DOES_NOT_EXIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[rh2.a.EnumC4442a.CREATE_NEW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[rh2.a.EnumC4442a.CLEAR_BACKSTACK_AND_CREATE_NEW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[rh2.a.EnumC4442a.MOVE_EXISTING_TO_FRONT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f166149a = iArr;
        }
    }

    public a(Context context) {
        this.context = context;
        c cVar = context instanceof c ? (c) context : null;
        if (cVar == null) {
            throw new IllegalArgumentException("Use FragmentNavigator on AppCompatActivity extension only.");
        }
        this.activity = cVar;
    }

    private final b d(rh2.a.EnumC4442a enumC4442a) {
        int i15 = C4160a.f166149a[enumC4442a.ordinal()];
        if (i15 == 1) {
            return b.POP_TO_EXISTING;
        }
        if (i15 == 2) {
            return b.POP_TO_EXISTING_CLEAR_BACKSTACK_WHEN_DOES_NOT_EXIST;
        }
        if (i15 == 3) {
            return b.CREATE_NEW;
        }
        if (i15 == 4) {
            return b.CLEAR_BACKSTACK_AND_CREATE_NEW;
        }
        if (i15 == 5) {
            return b.MOVE_EXISTING_TO_FRONT;
        }
        throw new p();
    }

    @Override // rh2.a
    public void b(o fragment, String tag, rh2.a.EnumC4442a existingFragmentNavigation) {
        sh2.a.m(fragment, tag, true, true, d(existingFragmentNavigation));
    }

    @Override // rh2.a
    public void c(String tag) {
        sh2.a.l(this.activity, tag);
    }
}
