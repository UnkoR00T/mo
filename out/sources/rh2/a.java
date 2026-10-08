package rh2;

import androidx.fragment.app.o;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0001\rJ)\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lrh2/a;", "", "Landroidx/fragment/app/o;", "fragment", "", "tag", "Lrh2/a$a;", "existingFragmentNavigation", "Loq/i0;", "b", "(Landroidx/fragment/app/o;Ljava/lang/String;Lrh2/a$a;)V", "c", "(Ljava/lang/String;)V", "a", "legacy_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {

    /* JADX INFO: renamed from: rh2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lrh2/a$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "legacy_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum EnumC4442a {
        CREATE_NEW,
        CLEAR_BACKSTACK_AND_CREATE_NEW,
        POP_TO_EXISTING,
        POP_TO_EXISTING_CLEAR_BACKSTACK_WHEN_DOES_NOT_EXIST,
        MOVE_EXISTING_TO_FRONT;


        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ wq.a f173843g = wq.b.a(b());
    }

    static /* synthetic */ void a(a aVar, o oVar, String str, EnumC4442a enumC4442a, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigate");
        }
        if ((i15 & 4) != 0) {
            enumC4442a = EnumC4442a.CREATE_NEW;
        }
        aVar.b(oVar, str, enumC4442a);
    }

    void b(o fragment, String tag, EnumC4442a existingFragmentNavigation);

    void c(String tag);
}
