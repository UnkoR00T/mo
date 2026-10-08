package ts3;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lts3/c;", "", "a", "b", "Lts3/c$a;", "Lts3/c$b;", "zusvisit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lts3/c$a;", "Lts3/c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zusvisit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f191908a = new a();

        private a() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof a);
        }

        public int hashCode() {
            return -2116630720;
        }

        public String toString() {
            return "Initial";
        }
    }

    /* JADX INFO: renamed from: ts3.c$b, reason: from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\"\b\u0087\b\u0018\u00002\u00020\u0001Bå\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0010¢\u0006\u0004\b\u001b\u0010\u001cJî\u0001\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u00042\b\b\u0002\u0010\u0018\u001a\u00020\u00102\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u0010HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020\u00102\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b0\u0010-\u001a\u0004\b1\u0010/R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b2\u0010)\u001a\u0004\b3\u0010+R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b4\u0010-\u001a\u0004\b5\u0010/R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b6\u0010-\u001a\u0004\b7\u0010/R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b8\u0010)\u001a\u0004\b2\u0010+R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b9\u0010-\u001a\u0004\b6\u0010/R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b*\u0010-\u001a\u0004\b4\u0010/R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b1\u0010)\u001a\u0004\b8\u0010+R\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b.\u0010-\u001a\u0004\b:\u0010/R\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b;\u0010-\u001a\u0004\b9\u0010/R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b3\u0010<\u001a\u0004\b0\u0010=R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b7\u0010)\u001a\u0004\b>\u0010+R\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b5\u0010-\u001a\u0004\b?\u0010/R\u0017\u0010\u0014\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b@\u0010-\u001a\u0004\bA\u0010/R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bB\u0010)\u001a\u0004\bC\u0010+R\u0017\u0010\u0016\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b>\u0010-\u001a\u0004\bD\u0010/R\u0017\u0010\u0017\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bA\u0010-\u001a\u0004\bE\u0010/R\u0017\u0010\u0018\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bC\u0010<\u001a\u0004\bB\u0010=R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bE\u0010)\u001a\u0004\b;\u0010+R\u0017\u0010\u001a\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bF\u0010<\u001a\u0004\b@\u0010=¨\u0006G"}, d2 = {"Lts3/c$b;", "Lts3/c;", "Liy/b0;", "email", "Lhz/b;", "emailValidationStateOnChecked", "emailValidationState", "phoneNumber", "phoneValidationStateOnChecked", "phoneValidationState", "caregiverName", "caregiverNameValidationStateOnChecked", "caregiverNameValidationState", "caregiverSurname", "caregiverSurnameValidationStateOnChecked", "caregiverSurnameValidationState", "", "caregiverCardExpanded", "translatorName", "translatorNameValidationStateOnChecked", "translatorNameValidationState", "translatorSurname", "translatorSurnameValidationStateOnChecked", "translatorSurnameValidationState", "translatorCardExpanded", "pesel", "sharePesel", "<init>", "(Liy/b0;Lhz/b;Lhz/b;Liy/b0;Lhz/b;Lhz/b;Liy/b0;Lhz/b;Lhz/b;Liy/b0;Lhz/b;Lhz/b;ZLiy/b0;Lhz/b;Lhz/b;Liy/b0;Lhz/b;Lhz/b;ZLiy/b0;Z)V", "a", "(Liy/b0;Lhz/b;Lhz/b;Liy/b0;Lhz/b;Lhz/b;Liy/b0;Lhz/b;Lhz/b;Liy/b0;Lhz/b;Lhz/b;ZLiy/b0;Lhz/b;Lhz/b;Liy/b0;Lhz/b;Lhz/b;ZLiy/b0;Z)Lts3/c$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Liy/b0;", "i", "()Liy/b0;", "b", "Lhz/b;", "k", "()Lhz/b;", "c", "j", "d", "m", "e", "o", "f", "n", "g", "h", "getCaregiverSurnameValidationStateOnChecked", "l", "Z", "()Z", "r", "getTranslatorNameValidationStateOnChecked", "p", "s", "q", "t", "getTranslatorSurnameValidationStateOnChecked", "u", "v", "zusvisit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Initialized implements c {

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final int f191909w;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final iy.b0 email;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final hz.b emailValidationStateOnChecked;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final hz.b emailValidationState;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final iy.b0 phoneNumber;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final hz.b phoneValidationStateOnChecked;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final hz.b phoneValidationState;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final iy.b0 caregiverName;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final hz.b caregiverNameValidationStateOnChecked;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final hz.b caregiverNameValidationState;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final iy.b0 caregiverSurname;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final hz.b caregiverSurnameValidationStateOnChecked;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final hz.b caregiverSurnameValidationState;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean caregiverCardExpanded;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        private final iy.b0 translatorName;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
        private final hz.b translatorNameValidationStateOnChecked;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
        private final hz.b translatorNameValidationState;

        /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
        private final iy.b0 translatorSurname;

        /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
        private final hz.b translatorSurnameValidationStateOnChecked;

        /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
        private final hz.b translatorSurnameValidationState;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean translatorCardExpanded;

        /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
        private final iy.b0 pesel;

        /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean sharePesel;

        static {
            int i15 = iy.b0.f97726c;
            int i16 = hz.b.f86845b;
            f191909w = i15 | i16 | i15 | i16 | i16 | i15 | i16 | i16 | i15 | i16 | i16 | i15 | i16 | i16 | i15 | i16 | i16 | i15 | i16;
        }

        public Initialized() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, false, null, false, 4194303, null);
        }

        public static /* synthetic */ Initialized b(Initialized initialized, iy.b0 b0Var, hz.b bVar, hz.b bVar2, iy.b0 b0Var2, hz.b bVar3, hz.b bVar4, iy.b0 b0Var3, hz.b bVar5, hz.b bVar6, iy.b0 b0Var4, hz.b bVar7, hz.b bVar8, boolean z15, iy.b0 b0Var5, hz.b bVar9, hz.b bVar10, iy.b0 b0Var6, hz.b bVar11, hz.b bVar12, boolean z16, iy.b0 b0Var7, boolean z17, int i15, Object obj) {
            boolean z18;
            iy.b0 b0Var8;
            iy.b0 b0Var9 = (i15 & 1) != 0 ? initialized.email : b0Var;
            hz.b bVar13 = (i15 & 2) != 0 ? initialized.emailValidationStateOnChecked : bVar;
            hz.b bVar14 = (i15 & 4) != 0 ? initialized.emailValidationState : bVar2;
            iy.b0 b0Var10 = (i15 & 8) != 0 ? initialized.phoneNumber : b0Var2;
            hz.b bVar15 = (i15 & 16) != 0 ? initialized.phoneValidationStateOnChecked : bVar3;
            hz.b bVar16 = (i15 & 32) != 0 ? initialized.phoneValidationState : bVar4;
            iy.b0 b0Var11 = (i15 & 64) != 0 ? initialized.caregiverName : b0Var3;
            hz.b bVar17 = (i15 & 128) != 0 ? initialized.caregiverNameValidationStateOnChecked : bVar5;
            hz.b bVar18 = (i15 & 256) != 0 ? initialized.caregiverNameValidationState : bVar6;
            iy.b0 b0Var12 = (i15 & 512) != 0 ? initialized.caregiverSurname : b0Var4;
            hz.b bVar19 = (i15 & 1024) != 0 ? initialized.caregiverSurnameValidationStateOnChecked : bVar7;
            hz.b bVar20 = (i15 & 2048) != 0 ? initialized.caregiverSurnameValidationState : bVar8;
            boolean z19 = (i15 & PKIFailureInfo.certConfirmed) != 0 ? initialized.caregiverCardExpanded : z15;
            iy.b0 b0Var13 = (i15 & PKIFailureInfo.certRevoked) != 0 ? initialized.translatorName : b0Var5;
            iy.b0 b0Var14 = b0Var9;
            hz.b bVar21 = (i15 & 16384) != 0 ? initialized.translatorNameValidationStateOnChecked : bVar9;
            hz.b bVar22 = (i15 & 32768) != 0 ? initialized.translatorNameValidationState : bVar10;
            iy.b0 b0Var15 = (i15 & PKIFailureInfo.notAuthorized) != 0 ? initialized.translatorSurname : b0Var6;
            hz.b bVar23 = (i15 & PKIFailureInfo.unsupportedVersion) != 0 ? initialized.translatorSurnameValidationStateOnChecked : bVar11;
            hz.b bVar24 = (i15 & PKIFailureInfo.transactionIdInUse) != 0 ? initialized.translatorSurnameValidationState : bVar12;
            boolean z25 = (i15 & PKIFailureInfo.signerNotTrusted) != 0 ? initialized.translatorCardExpanded : z16;
            iy.b0 b0Var16 = (i15 & PKIFailureInfo.badCertTemplate) != 0 ? initialized.pesel : b0Var7;
            if ((i15 & PKIFailureInfo.badSenderNonce) != 0) {
                b0Var8 = b0Var16;
                z18 = initialized.sharePesel;
            } else {
                z18 = z17;
                b0Var8 = b0Var16;
            }
            return initialized.a(b0Var14, bVar13, bVar14, b0Var10, bVar15, bVar16, b0Var11, bVar17, bVar18, b0Var12, bVar19, bVar20, z19, b0Var13, bVar21, bVar22, b0Var15, bVar23, bVar24, z25, b0Var8, z18);
        }

        public final Initialized a(iy.b0 email, hz.b emailValidationStateOnChecked, hz.b emailValidationState, iy.b0 phoneNumber, hz.b phoneValidationStateOnChecked, hz.b phoneValidationState, iy.b0 caregiverName, hz.b caregiverNameValidationStateOnChecked, hz.b caregiverNameValidationState, iy.b0 caregiverSurname, hz.b caregiverSurnameValidationStateOnChecked, hz.b caregiverSurnameValidationState, boolean caregiverCardExpanded, iy.b0 translatorName, hz.b translatorNameValidationStateOnChecked, hz.b translatorNameValidationState, iy.b0 translatorSurname, hz.b translatorSurnameValidationStateOnChecked, hz.b translatorSurnameValidationState, boolean translatorCardExpanded, iy.b0 pesel, boolean sharePesel) {
            return new Initialized(email, emailValidationStateOnChecked, emailValidationState, phoneNumber, phoneValidationStateOnChecked, phoneValidationState, caregiverName, caregiverNameValidationStateOnChecked, caregiverNameValidationState, caregiverSurname, caregiverSurnameValidationStateOnChecked, caregiverSurnameValidationState, caregiverCardExpanded, translatorName, translatorNameValidationStateOnChecked, translatorNameValidationState, translatorSurname, translatorSurnameValidationStateOnChecked, translatorSurnameValidationState, translatorCardExpanded, pesel, sharePesel);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getCaregiverCardExpanded() {
            return this.caregiverCardExpanded;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final iy.b0 getCaregiverName() {
            return this.caregiverName;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final hz.b getCaregiverNameValidationState() {
            return this.caregiverNameValidationState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Initialized)) {
                return false;
            }
            Initialized initialized = (Initialized) other;
            return fr.t.c(this.email, initialized.email) && fr.t.c(this.emailValidationStateOnChecked, initialized.emailValidationStateOnChecked) && fr.t.c(this.emailValidationState, initialized.emailValidationState) && fr.t.c(this.phoneNumber, initialized.phoneNumber) && fr.t.c(this.phoneValidationStateOnChecked, initialized.phoneValidationStateOnChecked) && fr.t.c(this.phoneValidationState, initialized.phoneValidationState) && fr.t.c(this.caregiverName, initialized.caregiverName) && fr.t.c(this.caregiverNameValidationStateOnChecked, initialized.caregiverNameValidationStateOnChecked) && fr.t.c(this.caregiverNameValidationState, initialized.caregiverNameValidationState) && fr.t.c(this.caregiverSurname, initialized.caregiverSurname) && fr.t.c(this.caregiverSurnameValidationStateOnChecked, initialized.caregiverSurnameValidationStateOnChecked) && fr.t.c(this.caregiverSurnameValidationState, initialized.caregiverSurnameValidationState) && this.caregiverCardExpanded == initialized.caregiverCardExpanded && fr.t.c(this.translatorName, initialized.translatorName) && fr.t.c(this.translatorNameValidationStateOnChecked, initialized.translatorNameValidationStateOnChecked) && fr.t.c(this.translatorNameValidationState, initialized.translatorNameValidationState) && fr.t.c(this.translatorSurname, initialized.translatorSurname) && fr.t.c(this.translatorSurnameValidationStateOnChecked, initialized.translatorSurnameValidationStateOnChecked) && fr.t.c(this.translatorSurnameValidationState, initialized.translatorSurnameValidationState) && this.translatorCardExpanded == initialized.translatorCardExpanded && fr.t.c(this.pesel, initialized.pesel) && this.sharePesel == initialized.sharePesel;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final hz.b getCaregiverNameValidationStateOnChecked() {
            return this.caregiverNameValidationStateOnChecked;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final iy.b0 getCaregiverSurname() {
            return this.caregiverSurname;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final hz.b getCaregiverSurnameValidationState() {
            return this.caregiverSurnameValidationState;
        }

        public int hashCode() {
            int iHashCode = ((((((((((((((((((((((((((((((((((((((this.email.hashCode() * 31) + this.emailValidationStateOnChecked.hashCode()) * 31) + this.emailValidationState.hashCode()) * 31) + this.phoneNumber.hashCode()) * 31) + this.phoneValidationStateOnChecked.hashCode()) * 31) + this.phoneValidationState.hashCode()) * 31) + this.caregiverName.hashCode()) * 31) + this.caregiverNameValidationStateOnChecked.hashCode()) * 31) + this.caregiverNameValidationState.hashCode()) * 31) + this.caregiverSurname.hashCode()) * 31) + this.caregiverSurnameValidationStateOnChecked.hashCode()) * 31) + this.caregiverSurnameValidationState.hashCode()) * 31) + Boolean.hashCode(this.caregiverCardExpanded)) * 31) + this.translatorName.hashCode()) * 31) + this.translatorNameValidationStateOnChecked.hashCode()) * 31) + this.translatorNameValidationState.hashCode()) * 31) + this.translatorSurname.hashCode()) * 31) + this.translatorSurnameValidationStateOnChecked.hashCode()) * 31) + this.translatorSurnameValidationState.hashCode()) * 31) + Boolean.hashCode(this.translatorCardExpanded)) * 31;
            iy.b0 b0Var = this.pesel;
            return ((iHashCode + (b0Var == null ? 0 : b0Var.hashCode())) * 31) + Boolean.hashCode(this.sharePesel);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final iy.b0 getEmail() {
            return this.email;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final hz.b getEmailValidationState() {
            return this.emailValidationState;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final hz.b getEmailValidationStateOnChecked() {
            return this.emailValidationStateOnChecked;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final iy.b0 getPesel() {
            return this.pesel;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final iy.b0 getPhoneNumber() {
            return this.phoneNumber;
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final hz.b getPhoneValidationState() {
            return this.phoneValidationState;
        }

        /* JADX INFO: renamed from: o, reason: from getter */
        public final hz.b getPhoneValidationStateOnChecked() {
            return this.phoneValidationStateOnChecked;
        }

        /* JADX INFO: renamed from: p, reason: from getter */
        public final boolean getSharePesel() {
            return this.sharePesel;
        }

        /* JADX INFO: renamed from: q, reason: from getter */
        public final boolean getTranslatorCardExpanded() {
            return this.translatorCardExpanded;
        }

        /* JADX INFO: renamed from: r, reason: from getter */
        public final iy.b0 getTranslatorName() {
            return this.translatorName;
        }

        /* JADX INFO: renamed from: s, reason: from getter */
        public final hz.b getTranslatorNameValidationState() {
            return this.translatorNameValidationState;
        }

        /* JADX INFO: renamed from: t, reason: from getter */
        public final iy.b0 getTranslatorSurname() {
            return this.translatorSurname;
        }

        public String toString() {
            return "Initialized(email=" + this.email + ", emailValidationStateOnChecked=" + this.emailValidationStateOnChecked + ", emailValidationState=" + this.emailValidationState + ", phoneNumber=" + this.phoneNumber + ", phoneValidationStateOnChecked=" + this.phoneValidationStateOnChecked + ", phoneValidationState=" + this.phoneValidationState + ", caregiverName=" + this.caregiverName + ", caregiverNameValidationStateOnChecked=" + this.caregiverNameValidationStateOnChecked + ", caregiverNameValidationState=" + this.caregiverNameValidationState + ", caregiverSurname=" + this.caregiverSurname + ", caregiverSurnameValidationStateOnChecked=" + this.caregiverSurnameValidationStateOnChecked + ", caregiverSurnameValidationState=" + this.caregiverSurnameValidationState + ", caregiverCardExpanded=" + this.caregiverCardExpanded + ", translatorName=" + this.translatorName + ", translatorNameValidationStateOnChecked=" + this.translatorNameValidationStateOnChecked + ", translatorNameValidationState=" + this.translatorNameValidationState + ", translatorSurname=" + this.translatorSurname + ", translatorSurnameValidationStateOnChecked=" + this.translatorSurnameValidationStateOnChecked + ", translatorSurnameValidationState=" + this.translatorSurnameValidationState + ", translatorCardExpanded=" + this.translatorCardExpanded + ", pesel=" + this.pesel + ", sharePesel=" + this.sharePesel + ')';
        }

        /* JADX INFO: renamed from: u, reason: from getter */
        public final hz.b getTranslatorSurnameValidationState() {
            return this.translatorSurnameValidationState;
        }

        public Initialized(iy.b0 b0Var, hz.b bVar, hz.b bVar2, iy.b0 b0Var2, hz.b bVar3, hz.b bVar4, iy.b0 b0Var3, hz.b bVar5, hz.b bVar6, iy.b0 b0Var4, hz.b bVar7, hz.b bVar8, boolean z15, iy.b0 b0Var5, hz.b bVar9, hz.b bVar10, iy.b0 b0Var6, hz.b bVar11, hz.b bVar12, boolean z16, iy.b0 b0Var7, boolean z17) {
            this.email = b0Var;
            this.emailValidationStateOnChecked = bVar;
            this.emailValidationState = bVar2;
            this.phoneNumber = b0Var2;
            this.phoneValidationStateOnChecked = bVar3;
            this.phoneValidationState = bVar4;
            this.caregiverName = b0Var3;
            this.caregiverNameValidationStateOnChecked = bVar5;
            this.caregiverNameValidationState = bVar6;
            this.caregiverSurname = b0Var4;
            this.caregiverSurnameValidationStateOnChecked = bVar7;
            this.caregiverSurnameValidationState = bVar8;
            this.caregiverCardExpanded = z15;
            this.translatorName = b0Var5;
            this.translatorNameValidationStateOnChecked = bVar9;
            this.translatorNameValidationState = bVar10;
            this.translatorSurname = b0Var6;
            this.translatorSurnameValidationStateOnChecked = bVar11;
            this.translatorSurnameValidationState = bVar12;
            this.translatorCardExpanded = z16;
            this.pesel = b0Var7;
            this.sharePesel = z17;
        }

        public /* synthetic */ Initialized(iy.b0 b0Var, hz.b bVar, hz.b bVar2, iy.b0 b0Var2, hz.b bVar3, hz.b bVar4, iy.b0 b0Var3, hz.b bVar5, hz.b bVar6, iy.b0 b0Var4, hz.b bVar7, hz.b bVar8, boolean z15, iy.b0 b0Var5, hz.b bVar9, hz.b bVar10, iy.b0 b0Var6, hz.b bVar11, hz.b bVar12, boolean z16, iy.b0 b0Var7, boolean z17, int i15, fr.k kVar) {
            this((i15 & 1) != 0 ? iy.b0.INSTANCE.a() : b0Var, (i15 & 2) != 0 ? hz.b.C2039b.f86846c : bVar, (i15 & 4) != 0 ? hz.b.C2039b.f86846c : bVar2, (i15 & 8) != 0 ? iy.b0.INSTANCE.a() : b0Var2, (i15 & 16) != 0 ? hz.b.d.f86848c : bVar3, (i15 & 32) != 0 ? hz.b.d.f86848c : bVar4, (i15 & 64) != 0 ? iy.b0.INSTANCE.a() : b0Var3, (i15 & 128) != 0 ? hz.b.d.f86848c : bVar5, (i15 & 256) != 0 ? hz.b.d.f86848c : bVar6, (i15 & 512) != 0 ? iy.b0.INSTANCE.a() : b0Var4, (i15 & 1024) != 0 ? hz.b.d.f86848c : bVar7, (i15 & 2048) != 0 ? hz.b.d.f86848c : bVar8, (i15 & PKIFailureInfo.certConfirmed) != 0 ? false : z15, (i15 & PKIFailureInfo.certRevoked) != 0 ? iy.b0.INSTANCE.a() : b0Var5, (i15 & 16384) != 0 ? hz.b.d.f86848c : bVar9, (i15 & 32768) != 0 ? hz.b.d.f86848c : bVar10, (i15 & PKIFailureInfo.notAuthorized) != 0 ? iy.b0.INSTANCE.a() : b0Var6, (i15 & PKIFailureInfo.unsupportedVersion) != 0 ? hz.b.d.f86848c : bVar11, (i15 & PKIFailureInfo.transactionIdInUse) != 0 ? hz.b.d.f86848c : bVar12, (i15 & PKIFailureInfo.signerNotTrusted) != 0 ? false : z16, (i15 & PKIFailureInfo.badCertTemplate) != 0 ? null : b0Var7, (i15 & PKIFailureInfo.badSenderNonce) != 0 ? false : z17);
        }
    }
}
