package mj1;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p071kotlin.Metadata;
import vi1.ChildParticipant;
import xw.PhoneNumber;

/* JADX INFO: renamed from: mj1.g, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001:\u0002&\u0018BG\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0016\u0010\u0017JP\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020\u00132\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010*\u001a\u0004\b+\u0010,R\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b$\u00101\u001a\u0004\b-\u0010\u0012¨\u00062"}, d2 = {"Lmj1/g;", "", "Lmj1/g$a$a;", "email", "Lmj1/g$a$b;", "phoneNumber", "Lmj1/g$a$c;", "statement", "Ld60/j;", "Lmj1/g$b;", "scrollInstance", "", "Lvi1/a;", "children", "<init>", "(Lmj1/g$a$a;Lmj1/g$a$b;Lmj1/g$a$c;Ld60/j;Ljava/util/List;)V", "Lmj1/g$a;", "c", "()Ljava/util/List;", "", "j", "()Z", "f", "()Lmj1/g$b;", "a", "(Lmj1/g$a$a;Lmj1/g$a$b;Lmj1/g$a$c;Ld60/j;Ljava/util/List;)Lmj1/g;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lmj1/g$a$a;", "e", "()Lmj1/g$a$a;", "b", "Lmj1/g$a$b;", "g", "()Lmj1/g$a$b;", "Lmj1/g$a$c;", "i", "()Lmj1/g$a$c;", "d", "Ld60/j;", "h", "()Ld60/j;", "Ljava/util/List;", "defencetraining_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ContactDetailsFields {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final a.EmailTextInput email;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final a.PhoneNumberInput phoneNumber;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final a.StatementCheckBox statement;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final d60.j<b> scrollInstance;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<ChildParticipant> children;

    /* JADX INFO: renamed from: mj1.g$b */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lmj1/g$b;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "defencetraining_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum b {
        EMAIL,
        PHONE_NUMBER,
        STATEMENT;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ wq.a f126796e = wq.b.a(b());
    }

    public ContactDetailsFields() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ContactDetailsFields b(ContactDetailsFields contactDetailsFields, a.EmailTextInput emailTextInput, a.PhoneNumberInput phoneNumberInput, a.StatementCheckBox statementCheckBox, d60.j jVar, List list, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            emailTextInput = contactDetailsFields.email;
        }
        if ((i15 & 2) != 0) {
            phoneNumberInput = contactDetailsFields.phoneNumber;
        }
        if ((i15 & 4) != 0) {
            statementCheckBox = contactDetailsFields.statement;
        }
        if ((i15 & 8) != 0) {
            jVar = contactDetailsFields.scrollInstance;
        }
        if ((i15 & 16) != 0) {
            list = contactDetailsFields.children;
        }
        List list2 = list;
        a.StatementCheckBox statementCheckBox2 = statementCheckBox;
        return contactDetailsFields.a(emailTextInput, phoneNumberInput, statementCheckBox2, jVar, list2);
    }

    private final List<a> c() {
        return pq.v.q(this.email, this.phoneNumber, this.statement);
    }

    public final ContactDetailsFields a(a.EmailTextInput email, a.PhoneNumberInput phoneNumber, a.StatementCheckBox statement, d60.j<b> scrollInstance, List<ChildParticipant> children) {
        return new ContactDetailsFields(email, phoneNumber, statement, scrollInstance, children);
    }

    public final List<ChildParticipant> d() {
        return this.children;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final a.EmailTextInput getEmail() {
        return this.email;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContactDetailsFields)) {
            return false;
        }
        ContactDetailsFields contactDetailsFields = (ContactDetailsFields) other;
        return fr.t.c(this.email, contactDetailsFields.email) && fr.t.c(this.phoneNumber, contactDetailsFields.phoneNumber) && fr.t.c(this.statement, contactDetailsFields.statement) && fr.t.c(this.scrollInstance, contactDetailsFields.scrollInstance) && fr.t.c(this.children, contactDetailsFields.children);
    }

    public final b f() {
        Object next;
        Iterator<T> it = c().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((a) next).isValid());
        a aVar = (a) next;
        if (aVar != null) {
            return aVar.a();
        }
        return null;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final a.PhoneNumberInput getPhoneNumber() {
        return this.phoneNumber;
    }

    public final d60.j<b> h() {
        return this.scrollInstance;
    }

    public int hashCode() {
        int iHashCode = ((((this.email.hashCode() * 31) + this.phoneNumber.hashCode()) * 31) + this.statement.hashCode()) * 31;
        d60.j<b> jVar = this.scrollInstance;
        return ((iHashCode + (jVar == null ? 0 : jVar.hashCode())) * 31) + this.children.hashCode();
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final a.StatementCheckBox getStatement() {
        return this.statement;
    }

    public final boolean j() {
        List<a> listC = c();
        if ((listC instanceof Collection) && listC.isEmpty()) {
            return true;
        }
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            if (!((a) it.next()).isValid()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        return "ContactDetailsFields(email=" + this.email + ", phoneNumber=" + this.phoneNumber + ", statement=" + this.statement + ", scrollInstance=" + this.scrollInstance + ", children=" + this.children + ')';
    }

    /* JADX INFO: renamed from: mj1.g$a */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0006\b\tJ\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0001\u0003\n\u000b\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lmj1/g$a;", "", "", "isValid", "()Z", "Lmj1/g$b;", "a", "()Lmj1/g$b;", "b", "c", "Lmj1/g$a$a;", "Lmj1/g$a$b;", "Lmj1/g$a$c;", "defencetraining_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: mj1.g$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ$\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lmj1/g$a$a;", "Lmj1/g$a;", "Lhz/b;", "validationState", "Liy/b0;", "value", "<init>", "(Lhz/b;Liy/b0;)V", "", "isValid", "()Z", "Lmj1/g$b;", "a", "()Lmj1/g$b;", "b", "(Lhz/b;Liy/b0;)Lmj1/g$a$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lhz/b;", "d", "()Lhz/b;", "Liy/b0;", "e", "()Liy/b0;", "defencetraining_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class EmailTextInput implements a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f126782c = iy.b0.f97726c | hz.b.f86845b;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final hz.b validationState;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final iy.b0 value;

            /* JADX WARN: Multi-variable type inference failed */
            public EmailTextInput() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ EmailTextInput c(EmailTextInput emailTextInput, hz.b bVar, iy.b0 b0Var, int i15, Object obj) {
                if ((i15 & 1) != 0) {
                    bVar = emailTextInput.validationState;
                }
                if ((i15 & 2) != 0) {
                    b0Var = emailTextInput.value;
                }
                return emailTextInput.b(bVar, b0Var);
            }

            @Override // mj1.ContactDetailsFields.a
            public b a() {
                return b.EMAIL;
            }

            public final EmailTextInput b(hz.b validationState, iy.b0 value) {
                return new EmailTextInput(validationState, value);
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final hz.b getValidationState() {
                return this.validationState;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final iy.b0 getValue() {
                return this.value;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof EmailTextInput)) {
                    return false;
                }
                EmailTextInput emailTextInput = (EmailTextInput) other;
                return fr.t.c(this.validationState, emailTextInput.validationState) && fr.t.c(this.value, emailTextInput.value);
            }

            public int hashCode() {
                return (this.validationState.hashCode() * 31) + this.value.hashCode();
            }

            @Override // mj1.ContactDetailsFields.a
            public boolean isValid() {
                return this.validationState.a();
            }

            public String toString() {
                return "EmailTextInput(validationState=" + this.validationState + ", value=" + this.value + ')';
            }

            public EmailTextInput(hz.b bVar, iy.b0 b0Var) {
                this.validationState = bVar;
                this.value = b0Var;
            }

            public /* synthetic */ EmailTextInput(hz.b bVar, iy.b0 b0Var, int i15, fr.k kVar) {
                this((i15 & 1) != 0 ? hz.b.C2039b.f86846c : bVar, (i15 & 2) != 0 ? iy.b0.INSTANCE.a() : b0Var);
            }
        }

        /* JADX INFO: renamed from: mj1.g$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ.\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lmj1/g$a$b;", "Lmj1/g$a;", "Lhz/b;", "numberValidationState", "prefixValidationState", "Lxw/h;", "value", "<init>", "(Lhz/b;Lhz/b;Lxw/h;)V", "", "isValid", "()Z", "Lmj1/g$b;", "a", "()Lmj1/g$b;", "b", "(Lhz/b;Lhz/b;Lxw/h;)Lmj1/g$a$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lhz/b;", "d", "()Lhz/b;", "e", "c", "Lxw/h;", "f", "()Lxw/h;", "defencetraining_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class PhoneNumberInput implements a {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final int f126785d;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final hz.b numberValidationState;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final hz.b prefixValidationState;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final PhoneNumber value;

            static {
                int i15 = PhoneNumber.f221634d;
                int i16 = hz.b.f86845b;
                f126785d = i15 | i16 | i16;
            }

            public PhoneNumberInput() {
                this(null, null, null, 7, null);
            }

            public static /* synthetic */ PhoneNumberInput c(PhoneNumberInput phoneNumberInput, hz.b bVar, hz.b bVar2, PhoneNumber phoneNumber, int i15, Object obj) {
                if ((i15 & 1) != 0) {
                    bVar = phoneNumberInput.numberValidationState;
                }
                if ((i15 & 2) != 0) {
                    bVar2 = phoneNumberInput.prefixValidationState;
                }
                if ((i15 & 4) != 0) {
                    phoneNumber = phoneNumberInput.value;
                }
                return phoneNumberInput.b(bVar, bVar2, phoneNumber);
            }

            @Override // mj1.ContactDetailsFields.a
            public b a() {
                return b.PHONE_NUMBER;
            }

            public final PhoneNumberInput b(hz.b numberValidationState, hz.b prefixValidationState, PhoneNumber value) {
                return new PhoneNumberInput(numberValidationState, prefixValidationState, value);
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final hz.b getNumberValidationState() {
                return this.numberValidationState;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final hz.b getPrefixValidationState() {
                return this.prefixValidationState;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PhoneNumberInput)) {
                    return false;
                }
                PhoneNumberInput phoneNumberInput = (PhoneNumberInput) other;
                return fr.t.c(this.numberValidationState, phoneNumberInput.numberValidationState) && fr.t.c(this.prefixValidationState, phoneNumberInput.prefixValidationState) && fr.t.c(this.value, phoneNumberInput.value);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final PhoneNumber getValue() {
                return this.value;
            }

            public int hashCode() {
                return (((this.numberValidationState.hashCode() * 31) + this.prefixValidationState.hashCode()) * 31) + this.value.hashCode();
            }

            @Override // mj1.ContactDetailsFields.a
            public boolean isValid() {
                return this.prefixValidationState.a() && this.numberValidationState.a();
            }

            public String toString() {
                return "PhoneNumberInput(numberValidationState=" + this.numberValidationState + ", prefixValidationState=" + this.prefixValidationState + ", value=" + this.value + ')';
            }

            public PhoneNumberInput(hz.b bVar, hz.b bVar2, PhoneNumber phoneNumber) {
                this.numberValidationState = bVar;
                this.prefixValidationState = bVar2;
                this.value = phoneNumber;
            }

            public /* synthetic */ PhoneNumberInput(hz.b bVar, hz.b bVar2, PhoneNumber phoneNumber, int i15, fr.k kVar) {
                this((i15 & 1) != 0 ? hz.b.C2039b.f86846c : bVar, (i15 & 2) != 0 ? hz.b.C2039b.f86846c : bVar2, (i15 & 4) != 0 ? PhoneNumber.INSTANCE.a() : phoneNumber);
            }
        }

        b a();

        boolean isValid();

        /* JADX INFO: renamed from: mj1.g$a$c, reason: from toString */
        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lmj1/g$a$c;", "Lmj1/g$a;", "", "isChecked", "Lhz/b;", "validationState", "<init>", "(ZLhz/b;)V", "isValid", "()Z", "Lmj1/g$b;", "a", "()Lmj1/g$b;", "b", "(ZLhz/b;)Lmj1/g$a$c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "e", "Lhz/b;", "d", "()Lhz/b;", "defencetraining_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class StatementCheckBox implements a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f126789c = hz.b.f86845b;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isChecked;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final hz.b validationState;

            public StatementCheckBox(boolean z15, hz.b bVar) {
                this.isChecked = z15;
                this.validationState = bVar;
            }

            public static /* synthetic */ StatementCheckBox c(StatementCheckBox statementCheckBox, boolean z15, hz.b bVar, int i15, Object obj) {
                if ((i15 & 1) != 0) {
                    z15 = statementCheckBox.isChecked;
                }
                if ((i15 & 2) != 0) {
                    bVar = statementCheckBox.validationState;
                }
                return statementCheckBox.b(z15, bVar);
            }

            @Override // mj1.ContactDetailsFields.a
            public b a() {
                return b.STATEMENT;
            }

            public final StatementCheckBox b(boolean isChecked, hz.b validationState) {
                return new StatementCheckBox(isChecked, validationState);
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final hz.b getValidationState() {
                return this.validationState;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final boolean getIsChecked() {
                return this.isChecked;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof StatementCheckBox)) {
                    return false;
                }
                StatementCheckBox statementCheckBox = (StatementCheckBox) other;
                return this.isChecked == statementCheckBox.isChecked && fr.t.c(this.validationState, statementCheckBox.validationState);
            }

            public int hashCode() {
                return (Boolean.hashCode(this.isChecked) * 31) + this.validationState.hashCode();
            }

            @Override // mj1.ContactDetailsFields.a
            public boolean isValid() {
                return this.validationState.a();
            }

            public String toString() {
                return "StatementCheckBox(isChecked=" + this.isChecked + ", validationState=" + this.validationState + ')';
            }

            public /* synthetic */ StatementCheckBox(boolean z15, hz.b bVar, int i15, fr.k kVar) {
                this((i15 & 1) != 0 ? false : z15, (i15 & 2) != 0 ? hz.b.C2039b.f86846c : bVar);
            }
        }
    }

    public ContactDetailsFields(a.EmailTextInput emailTextInput, a.PhoneNumberInput phoneNumberInput, a.StatementCheckBox statementCheckBox, d60.j<b> jVar, List<ChildParticipant> list) {
        this.email = emailTextInput;
        this.phoneNumber = phoneNumberInput;
        this.statement = statementCheckBox;
        this.scrollInstance = jVar;
        this.children = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ContactDetailsFields(a.EmailTextInput emailTextInput, a.PhoneNumberInput phoneNumberInput, a.StatementCheckBox statementCheckBox, d60.j jVar, List list, int i15, fr.k kVar) {
        int i16 = 3;
        this((i15 & 1) != 0 ? new a.EmailTextInput(null, 0 == true ? 1 : 0, i16, 0 == true ? 1 : 0) : emailTextInput, (i15 & 2) != 0 ? new a.PhoneNumberInput(null, null, null, 7, null) : phoneNumberInput, (i15 & 4) != 0 ? new a.StatementCheckBox(false, 0 == true ? 1 : 0, i16, 0 == true ? 1 : 0) : statementCheckBox, (i15 & 8) != 0 ? null : jVar, (i15 & 16) != 0 ? pq.v.n() : list);
    }
}
