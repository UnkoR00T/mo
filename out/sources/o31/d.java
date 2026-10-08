package o31;

import hz.i;
import iy.b0;
import iy.c0;
import j14.m;
import oq.p;
import org.bouncycastle.asn1.x509.DisplayText;
import p071kotlin.Metadata;
import wi0.CitizenshipDictionary;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000fB!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0013R\u0014\u0010\u0019\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0013R\u0014\u0010\u001b\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0013R\u0014\u0010\u001d\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0013R\u0014\u0010\u001f\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0013R\u0014\u0010!\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0013R\u0014\u0010#\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0013R\u0014\u0010%\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0013R\u0014\u0010'\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0013¨\u0006("}, d2 = {"Lo31/d;", "Lgz/b;", "Lo31/d$a;", "Lhz/g;", "Lmx/c;", "labelProvider", "Lhz/i;", "validatorTextFactory", "Lj14/m;", "checkPeselNumberCorrectUC", "<init>", "(Lmx/c;Lhz/i;Lj14/m;)V", "params", "d", "(Lo31/d$a;Ltq/e;)Ljava/lang/Object;", "a", "Lj14/m;", "Lhz/h;", "b", "Lhz/h;", "nameValidator", "c", "secondNameValidator", "lastNameValidator", "e", "familyNameValidator", "f", "nextNameValidator", "g", "placeOfBrithValidator", "h", "fatherNameValidator", "i", "dateOfBrithValidator", "j", "citizenshipValidator", "k", "placeOfCertificateValidator", "l", "certificateNumberValidator", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements gz.b<a, hz.g> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final m checkPeselNumberCorrectUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final hz.h nameValidator;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final hz.h secondNameValidator;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final hz.h lastNameValidator;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final hz.h familyNameValidator;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final hz.h nextNameValidator;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final hz.h placeOfBrithValidator;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final hz.h fatherNameValidator;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final hz.h dateOfBrithValidator;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final hz.h citizenshipValidator;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final hz.h placeOfCertificateValidator;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final hz.h certificateNumberValidator;

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\f\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0006B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\u0082\u0001\f\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f¨\u0006 "}, d2 = {"Lo31/d$a;", "Lgz/b$a;", "Liy/b0;", "text", "<init>", "(Liy/b0;)V", "a", "Liy/b0;", "()Liy/b0;", "f", "l", "h", "g", "d", "i", "j", "e", "c", "b", "k", "Lo31/d$a$a;", "Lo31/d$a$b;", "Lo31/d$a$c;", "Lo31/d$a$d;", "Lo31/d$a$e;", "Lo31/d$a$f;", "Lo31/d$a$g;", "Lo31/d$a$h;", "Lo31/d$a$i;", "Lo31/d$a$j;", "Lo31/d$a$k;", "Lo31/d$a$l;", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class a implements gz.b.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f141888b = b0.f97726c;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final b0 text;

        /* JADX INFO: renamed from: o31.d$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lo31/d$a$a;", "Lo31/d$a;", "Liy/b0;", "text", "<init>", "(Liy/b0;)V", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class C3494a extends a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f141890c = b0.f97726c;

            public C3494a(b0 b0Var) {
                super(b0Var, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lo31/d$a$b;", "Lo31/d$a;", "Lwi0/a;", "citizenship", "<init>", "(Lwi0/a;)V", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class b extends a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f141891c = b0.f97726c;

            public b(CitizenshipDictionary citizenshipDictionary) {
                String name;
                b0 b0VarG;
                super((citizenshipDictionary == null || (name = citizenshipDictionary.getName()) == null || (b0VarG = c0.g(name)) == null) ? c0.g("") : b0VarG, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lo31/d$a$c;", "Lo31/d$a;", "Lfz/b$c;", "date", "<init>", "(Lfz/b$c;)V", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class c extends a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f141892c = b0.f97726c;

            public c(fz.b.LocalDate localDate) {
                String string;
                b0 b0VarG;
                super((localDate == null || (string = localDate.toString()) == null || (b0VarG = c0.g(string)) == null) ? c0.g("") : b0VarG, null);
            }
        }

        /* JADX INFO: renamed from: o31.d$a$d, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lo31/d$a$d;", "Lo31/d$a;", "Liy/b0;", "text", "<init>", "(Liy/b0;)V", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class C3495d extends a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f141893c = b0.f97726c;

            public C3495d(b0 b0Var) {
                super(b0Var, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lo31/d$a$e;", "Lo31/d$a;", "Liy/b0;", "text", "<init>", "(Liy/b0;)V", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class e extends a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f141894c = b0.f97726c;

            public e(b0 b0Var) {
                super(b0Var, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lo31/d$a$f;", "Lo31/d$a;", "Liy/b0;", "text", "<init>", "(Liy/b0;)V", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class f extends a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f141895c = b0.f97726c;

            public f(b0 b0Var) {
                super(b0Var, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lo31/d$a$g;", "Lo31/d$a;", "Liy/b0;", "text", "<init>", "(Liy/b0;)V", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class g extends a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f141896c = b0.f97726c;

            public g(b0 b0Var) {
                super(b0Var, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lo31/d$a$h;", "Lo31/d$a;", "Liy/b0;", "text", "<init>", "(Liy/b0;)V", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class h extends a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f141897c = b0.f97726c;

            public h(b0 b0Var) {
                super(b0Var, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lo31/d$a$i;", "Lo31/d$a;", "Liy/b0;", "text", "<init>", "(Liy/b0;)V", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class i extends a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f141898c = b0.f97726c;

            public i(b0 b0Var) {
                super(b0Var, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lo31/d$a$j;", "Lo31/d$a;", "Liy/b0;", "text", "<init>", "(Liy/b0;)V", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class j extends a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f141899c = b0.f97726c;

            public j(b0 b0Var) {
                super(b0Var, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lo31/d$a$k;", "Lo31/d$a;", "Liy/b0;", "text", "<init>", "(Liy/b0;)V", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class k extends a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f141900c = b0.f97726c;

            public k(b0 b0Var) {
                super(b0Var, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lo31/d$a$l;", "Lo31/d$a;", "Liy/b0;", "text", "<init>", "(Liy/b0;)V", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class l extends a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f141901c = b0.f97726c;

            public l(b0 b0Var) {
                super(b0Var, null);
            }
        }

        public /* synthetic */ a(b0 b0Var, fr.k kVar) {
            this(b0Var);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final b0 getText() {
            return this.text;
        }

        private a(b0 b0Var) {
            this.text = b0Var;
        }
    }

    public d(mx.c cVar, i iVar, m mVar) {
        this.checkPeselNumberCorrectUC = mVar;
        hz.c.Companion companion = hz.c.INSTANCE;
        this.nameValidator = ((hz.h) companion.a(companion.a(iVar.a().y(30, cVar.e(j31.a.f99172k3, "30")).M(cVar.c(j31.a.f99152g3)), new m31.d.C3018d(cVar.c(j31.a.f99187n3))), new m31.d.c(cVar.c(j31.a.f99187n3), null, 2, null))).F(cVar.c(j31.a.f99187n3)).o(cVar.c(j31.a.f99187n3));
        this.secondNameValidator = ((hz.h) companion.a(companion.a(iVar.a().y(30, cVar.e(j31.a.f99172k3, "30")).M(cVar.c(j31.a.f99212s3)), new m31.d.C3018d(cVar.c(j31.a.f99212s3))), new m31.d.c(cVar.c(j31.a.f99212s3), null, 2, null))).F(cVar.c(j31.a.f99212s3)).o(cVar.c(j31.a.f99212s3));
        this.lastNameValidator = ((hz.h) companion.a(companion.a(iVar.a().y(40, cVar.e(j31.a.f99172k3, "40")).M(cVar.c(j31.a.f99157h3)).K(cVar.c(j31.a.f99192o3)), new m31.d.C3018d(cVar.c(j31.a.f99192o3))), new m31.d.c(cVar.c(j31.a.f99192o3), "^[^{}\\[\\]:,_/\\\\@#$%^&*()?!+=<>|~`]*$"))).F(cVar.c(j31.a.f99192o3)).o(cVar.c(j31.a.f99192o3));
        this.familyNameValidator = ((hz.h) companion.a(companion.a(iVar.a().y(65, cVar.e(j31.a.f99172k3, "65")).M(cVar.c(j31.a.f99147f3)), new m31.d.C3018d(cVar.c(j31.a.f99182m3))), new m31.d.c(cVar.c(j31.a.f99182m3), "^[^{}\\[\\]:,_/\\\\@#$%^&*()?!+=<>|~`]*$"))).F(cVar.c(j31.a.f99182m3)).o(cVar.c(j31.a.f99182m3));
        this.nextNameValidator = ((hz.h) companion.a(companion.a(companion.a(iVar.a().y(DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE, cVar.e(j31.a.f99172k3, "200")).M(cVar.c(j31.a.f99197p3)), new m31.d.C3018d(cVar.c(j31.a.f99197p3))), new m31.d.c(cVar.c(j31.a.f99197p3), "^[^{}\\[\\]:'_/\\\\@#$%^&*()?!+=<>|~`]*$")), new m31.d.b(cVar.c(j31.a.f99197p3)))).F(cVar.c(j31.a.f99197p3)).o(cVar.c(j31.a.f99197p3));
        this.placeOfBrithValidator = (hz.h) companion.a(((hz.h) companion.a(companion.a(iVar.a().y(25, cVar.e(j31.a.f99172k3, "25")).M(cVar.c(j31.a.f99162i3)), new m31.d.C3018d(cVar.c(j31.a.f99202q3))), new m31.d.c(cVar.c(j31.a.f99202q3), "^[^{}\\[\\]:,'_/\\\\@#$%^&*?!+=<>|~`]*$"))).F(cVar.c(j31.a.f99202q3)).o(cVar.c(j31.a.f99202q3)), new m31.d.e(cVar.c(j31.a.f99202q3)));
        this.fatherNameValidator = ((hz.h) companion.a(companion.a(iVar.a().y(30, cVar.e(j31.a.f99172k3, "30")), new m31.d.C3018d(cVar.c(j31.a.G0))), new m31.d.c(cVar.c(j31.a.G0), "^[^{}\\[\\]:,_/\\\\@#$%^&*()?!+=<>|~`]*$"))).F(cVar.c(j31.a.G0)).o(cVar.c(j31.a.G0));
        this.dateOfBrithValidator = iVar.a().M(cVar.c(j31.a.f99142e3));
        this.citizenshipValidator = iVar.a().M(cVar.c(j31.a.f99141e2));
        this.placeOfCertificateValidator = (hz.h) companion.a(((hz.h) companion.a(companion.a(iVar.a().y(56, cVar.e(j31.a.f99172k3, "56")).M(cVar.c(j31.a.f99167j3)), new m31.d.C3018d(cVar.c(j31.a.f99207r3))), new m31.d.c(cVar.c(j31.a.f99207r3), "^[^{}\\[\\]:,'_/\\\\@#$%^&*?!+=<>|~`]*$"))).F(cVar.c(j31.a.f99207r3)).o(cVar.c(j31.a.f99207r3)), new m31.d.e(cVar.c(j31.a.f99207r3)));
        this.certificateNumberValidator = ((hz.h) companion.a(companion.a(iVar.a().y(65, cVar.e(j31.a.f99172k3, "65")), new m31.d.C3018d(cVar.c(j31.a.f99177l3))), new m31.d.c(cVar.c(j31.a.f99177l3), "^[^{}\\[\\]:,'_\\\\@#$%^&*()?!+=<>|~`]*$"))).F(cVar.c(j31.a.f99177l3)).o(cVar.c(j31.a.f99177l3));
    }

    public Object d(a aVar, tq.e<? super hz.g> eVar) {
        if (aVar instanceof a.f) {
            return this.nameValidator.a(c0.e(aVar.getText()));
        }
        if (aVar instanceof a.l) {
            return c0.e(aVar.getText()).length() == 0 ? hz.g.b.f86853b : this.secondNameValidator.a(c0.e(aVar.getText()));
        }
        if (aVar instanceof a.g) {
            return this.lastNameValidator.a(c0.e(aVar.getText()));
        }
        if (aVar instanceof a.C3495d) {
            return this.familyNameValidator.a(c0.e(aVar.getText()));
        }
        if (aVar instanceof a.h) {
            return c0.e(aVar.getText()).length() == 0 ? hz.g.b.f86853b : this.nextNameValidator.a(c0.e(aVar.getText()));
        }
        if (aVar instanceof a.i) {
            return this.checkPeselNumberCorrectUC.a(new m.Params(c0.e(aVar.getText()), false));
        }
        if (aVar instanceof a.j) {
            return this.placeOfBrithValidator.a(c0.e(aVar.getText()));
        }
        if (aVar instanceof a.c) {
            return this.dateOfBrithValidator.a(c0.e(aVar.getText()));
        }
        if (aVar instanceof a.b) {
            return this.citizenshipValidator.a(c0.e(aVar.getText()));
        }
        if (aVar instanceof a.C3494a) {
            return c0.e(aVar.getText()).length() == 0 ? hz.g.b.f86853b : this.certificateNumberValidator.a(c0.e(aVar.getText()));
        }
        if (aVar instanceof a.k) {
            return this.placeOfCertificateValidator.a(c0.e(aVar.getText()));
        }
        if (aVar instanceof a.e) {
            return c0.e(aVar.getText()).length() == 0 ? hz.g.b.f86853b : this.fatherNameValidator.a(c0.e(aVar.getText()));
        }
        throw new p();
    }
}
