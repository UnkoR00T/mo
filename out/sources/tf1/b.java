package tf1;

import fr.k;
import iy.b0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Ltf1/b;", "", "<init>", "()V", "a", "b", "Ltf1/b$a;", "Ltf1/b$b;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class b {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r¨\u0006\u000e"}, d2 = {"Ltf1/b$a;", "Ltf1/b;", "Liy/b0;", "email", "", "ceidgConsent", "<init>", "(Liy/b0;Z)V", "a", "Liy/b0;", "b", "()Liy/b0;", "Z", "()Z", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a extends b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f190036c = b0.f97726c;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final b0 email;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final boolean ceidgConsent;

        public a(b0 b0Var, boolean z15) {
            super(null);
            this.email = b0Var;
            this.ceidgConsent = z15;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getCeidgConsent() {
            return this.ceidgConsent;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final b0 getEmail() {
            return this.email;
        }
    }

    /* JADX INFO: renamed from: tf1.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Ltf1/b$b;", "Ltf1/b;", "", "hasNoEmail", "<init>", "(Z)V", "a", "Z", "()Z", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C4950b extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final boolean hasNoEmail;

        public C4950b(boolean z15) {
            super(null);
            this.hasNoEmail = z15;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getHasNoEmail() {
            return this.hasNoEmail;
        }
    }

    public /* synthetic */ b(k kVar) {
        this();
    }

    private b() {
    }
}
