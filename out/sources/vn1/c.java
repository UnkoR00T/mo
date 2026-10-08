package vn1;

import er.l;
import fr.k;
import fr.t;
import fu.r;
import iy.b0;
import iy.c0;
import mx.Label;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p071kotlin.Metadata;
import pq.v;
import ru3.ContactDetailsData;
import xw.PhoneNumber;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00122\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001:\u0002\u0012\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\u0011\u001a\u00020\u000e*\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lvn1/c;", "Lxw/f;", "Lvn1/c$b;", "Ltn1/c$a$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "h", "(Lvn1/c$b;)Ltn1/c$a$a;", "a", "Lmx/c;", "Lxw/h;", "Lmx/a;", "f", "(Lxw/h;)Lmx/a;", AnnotatedPrivateKey.LABEL, "b", "dependentidsuspension_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements xw.f<Params, tn1.c.Data.Section> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f207503b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f207504c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lvn1/c$a;", "", "<init>", "()V", "", "PHONE_NUMBER_SEPARATOR", "Ljava/lang/String;", "dependentidsuspension_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: vn1.c$b, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lvn1/c$b;", "", "Lru3/b;", "data", "Liy/b0;", "userEdorAddress", "<init>", "(Lru3/b;Liy/b0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lru3/b;", "()Lru3/b;", "b", "Liy/b0;", "()Liy/b0;", "dependentidsuspension_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ContactDetailsData data;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 userEdorAddress;

        public Params(ContactDetailsData contactDetailsData, b0 b0Var) {
            this.data = contactDetailsData;
            this.userEdorAddress = b0Var;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final ContactDetailsData getData() {
            return this.data;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final b0 getUserEdorAddress() {
            return this.userEdorAddress;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.data, params.data) && t.c(this.userEdorAddress, params.userEdorAddress);
        }

        public int hashCode() {
            return (this.data.hashCode() * 31) + this.userEdorAddress.hashCode();
        }

        public String toString() {
            return "Params(data=" + this.data + ", userEdorAddress=" + this.userEdorAddress + ')';
        }
    }

    public c(mx.c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence e(b0 b0Var) {
        return c0.e(b0Var);
    }

    private final Label f(PhoneNumber phoneNumber) {
        return mx.b.b(v.v0(v.q(phoneNumber.h(), phoneNumber.g()), " ", null, null, 0, null, new l() { // from class: vn1.b
            @Override // er.l
            public final Object b(Object obj) {
                return c.e((b0) obj);
            }
        }, 30, null), "phoneNumber");
    }

    @Override // er.l
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public tn1.c.Data.Section b(Params params) {
        DefaultSingleCardData defaultSingleCardData;
        boolean zT0 = r.t0(c0.e(params.getData().getPhoneNumber().g()));
        boolean zT1 = r.t0(c0.e(params.getData().getEmailAddress()));
        Label labelC = this.labelProvider.c(em1.a.f51954f);
        PhoneNumber phoneNumber = params.getData().getPhoneNumber();
        DefaultSingleCardData defaultSingleCardData2 = null;
        if (zT0) {
            phoneNumber = null;
        }
        if (phoneNumber != null) {
            defaultSingleCardData = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(em1.a.C), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(f(phoneNumber), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
        } else {
            defaultSingleCardData = null;
        }
        b0 emailAddress = params.getData().getEmailAddress();
        if (zT1) {
            emailAddress = null;
        }
        if (emailAddress != null) {
            defaultSingleCardData2 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(em1.a.f51958h), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(rm1.a.a(emailAddress, "emailAddress"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
        }
        return new tn1.c.Data.Section(labelC, new CardListData(v.s(defaultSingleCardData, defaultSingleCardData2, new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(em1.a.f51956g), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(rm1.a.a(params.getUserEdorAddress(), "communicationAddress"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null)), null, false, null, null, 30, null));
    }
}
