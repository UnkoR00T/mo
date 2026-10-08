package l61;

import al0.s0;
import cl0.BEChildPassportApplicationApplicant;
import cl0.BEPassportChildApplicationAttachments;
import cl0.BEPassportChildApplicationChild;
import cl0.BEPassportChildApplicationContact;
import cl0.BEPassportChildApplicationCorrespondenceAddress;
import cl0.BEPassportChildApplicationForeignCorrespondenceAddress;
import cl0.BEPassportChildApplicationPayment;
import cl0.BEPassportChildApplicationPolishCorrespondenceAddress;
import cl0.BEPassportChildApplicationPolishCorrespondenceAddressCity;
import cl0.BEPassportChildApplicationPolishCorrespondenceAddressStreet;
import cl0.BEPassportChildApplicationPolishCorrespondenceAddressVoivodeship;
import cl0.BEPassportChildApplicationXmlRequest;
import cl0.BEPassportChildApplicationXmlRequestPassportDocumentVisualizationData;
import cl0.PassportChildApplicationGetChildData;
import cl0.f0;
import cl0.g0;
import cl0.h0;
import cl0.j0;
import i61.DataSplit;
import iy.b0;
import iy.c0;
import j44.Access;
import java.time.LocalDate;
import java.util.concurrent.CancellationException;
import oq.i0;
import p071kotlin.Metadata;
import ru3.ContactDetailsData;
import st3.AddressTerytDetail;
import xw.PhoneNumber;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0001:\u0001\u001bB!\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ7\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J$\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u0018\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Ll61/g;", "Lgz/b;", "Ll61/g$a;", "Ldx/i;", "Lk44/a;", "Lry/a;", "Ll44/a;", "callActionWithEdorAuthTokenUC", "Lg14/a;", "getInfoFromPeselUC", "Lol0/b;", "generateXmlUC", "<init>", "(Ll44/a;Lg14/a;Lol0/b;)V", "Lxw/e;", "childGender", "Ly91/c$a;", "contractData", "Lcl0/j;", "attachments", "Ldx/b;", "Lcl0/d0;", "g", "(Lxw/e;Ly91/c$a;Lcl0/j;)Ldx/i;", "params", "h", "(Ll61/g$a;Ltq/e;)Ljava/lang/Object;", "a", "Ll44/a;", "b", "Lg14/a;", "c", "Lol0/b;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g implements gz.b<Params, dx.i<? extends k44.a, ? extends ry.a>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l44.a callActionWithEdorAuthTokenUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final g14.a getInfoFromPeselUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ol0.b generateXmlUC;

    /* JADX INFO: renamed from: l61.g$a, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Ll61/g$a;", "Lgz/b$a;", "Ly91/c$a;", "contractData", "Lcl0/j;", "attachments", "<init>", "(Ly91/c$a;Lcl0/j;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ly91/c$a;", "b", "()Ly91/c$a;", "Lcl0/j;", "()Lcl0/j;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final y91.c.SummaryContractData contractData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final BEPassportChildApplicationAttachments attachments;

        public Params(y91.c.SummaryContractData summaryContractData, BEPassportChildApplicationAttachments bEPassportChildApplicationAttachments) {
            this.contractData = summaryContractData;
            this.attachments = bEPassportChildApplicationAttachments;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final BEPassportChildApplicationAttachments getAttachments() {
            return this.attachments;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final y91.c.SummaryContractData getContractData() {
            return this.contractData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return fr.t.c(this.contractData, params.contractData) && fr.t.c(this.attachments, params.attachments);
        }

        public int hashCode() {
            int iHashCode = this.contractData.hashCode() * 31;
            BEPassportChildApplicationAttachments bEPassportChildApplicationAttachments = this.attachments;
            return iHashCode + (bEPassportChildApplicationAttachments == null ? 0 : bEPassportChildApplicationAttachments.hashCode());
        }

        public String toString() {
            return "Params(contractData=" + this.contractData + ", attachments=" + this.attachments + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f116371a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f116372b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f116373c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f116374d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int[] f116375e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ int[] f116376f;

        static {
            int[] iArr = new int[i61.t.values().length];
            try {
                iArr[i61.t.PARENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[i61.t.GUARDIAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f116371a = iArr;
            int[] iArr2 = new int[g0.values().length];
            try {
                iArr2[g0.POLAND.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[g0.ABROAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[g0.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            f116372b = iArr2;
            int[] iArr3 = new int[i61.l.values().length];
            try {
                iArr3[i61.l.SCHOOL_AGED_CHILDREN.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[i61.l.KDR_OWNERS.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[i61.l.TECHNICAL_ISSUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[i61.l.CHILD_TREATED_ABROAD.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[i61.l.TEMPORARY_PASSPORT.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            f116373c = iArr3;
            int[] iArr4 = new int[i61.r.values().length];
            try {
                iArr4[i61.r.DELIVERY.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr4[i61.r.IN_PERSON.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            f116374d = iArr4;
            int[] iArr5 = new int[j0.values().length];
            try {
                iArr5[j0.PICKER.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr5[j0.MANUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            f116375e = iArr5;
            int[] iArr6 = new int[i61.h.values().length];
            try {
                iArr6[i61.h.MEDICAL_EMERGENCY.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr6[i61.h.OCCUPATIONAL_EMERGENCY.ordinal()] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr6[i61.h.RETURN_TO_PERMANENT_PLACE_OF_RESIDENCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr6[i61.h.FULFILLING_THE_DUTY_OF_LEARNING_AND_SKILL_DEVELOPMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr6[i61.h.WAITING_FOR_A_PASSPORT_PREPARED_IN_POLAND.ordinal()] = 5;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr6[i61.h.FUNERAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused20) {
            }
            f116376f = iArr6;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lj44/f;", "accessToken", "Ldx/i;", "Ldx/b;", "Lry/a;", "<anonymous>", "(Lj44/f;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<Access, tq.e<? super dx.i<? extends dx.b, ? extends ry.a>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f116377e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f116378f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f116379g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f116380h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f116381j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f116382k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f116383l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Params f116385n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Params params, tq.e<? super c> eVar) {
            super(2, eVar);
            this.f116385n = params;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            g14.a.b.Success success;
            Access access = (Access) this.f116383l;
            Object objE = uq.b.e();
            int i15 = this.f116382k;
            if (i15 == 0) {
                oq.u.b(obj);
                g14.a.b bVarA = g.this.getInfoFromPeselUC.a(new g14.a.Params(this.f116385n.getContractData().getChildData().getPesel(), null));
                if (fr.t.c(bVarA, g14.a.b.C1568a.f69766a) || fr.t.c(bVarA, g14.a.b.C1569b.f69767a)) {
                    success = null;
                } else {
                    if (!(bVarA instanceof g14.a.b.Success)) {
                        throw new oq.p();
                    }
                    success = (g14.a.b.Success) bVarA;
                }
                dx.i iVarG = g.this.g(success != null ? success.getGender() : null, this.f116385n.getContractData(), this.f116385n.getAttachments());
                g gVar = g.this;
                if (iVarG instanceof dx.i.Left) {
                    return iVarG;
                }
                if (!(iVarG instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                BEPassportChildApplicationXmlRequest bEPassportChildApplicationXmlRequest = (BEPassportChildApplicationXmlRequest) ((dx.i.Right) iVarG).b();
                ol0.b bVar = gVar.generateXmlUC;
                ol0.b.Params params = new ol0.b.Params(c0.g(access.getValue()), bEPassportChildApplicationXmlRequest);
                this.f116383l = vq.j.a(access);
                this.f116377e = vq.j.a(success);
                this.f116378f = vq.j.a(iVarG);
                this.f116379g = vq.j.a(bEPassportChildApplicationXmlRequest);
                this.f116380h = 0;
                this.f116381j = 0;
                this.f116382k = 1;
                obj = bVar.c(params, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return (dx.i) obj;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(Access access, tq.e<? super dx.i<? extends dx.b, ry.a>> eVar) {
            return ((c) v(access, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            c cVar = g.this.new c(this.f116385n, eVar);
            cVar.f116383l = obj;
            return cVar;
        }
    }

    public g(l44.a aVar, g14.a aVar2, ol0.b bVar) {
        this.callActionWithEdorAuthTokenUC = aVar;
        this.getInfoFromPeselUC = aVar2;
        this.generateXmlUC = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:132:0x0324 A[Catch: Exception -> 0x0058, c -> 0x005b, CancellationException -> 0x005e, TryCatch #3 {Exception -> 0x0058, blocks: (B:3:0x0006, B:5:0x004f, B:12:0x0061, B:14:0x006b, B:15:0x006d, B:18:0x0087, B:22:0x0092, B:24:0x00ad, B:26:0x00b3, B:28:0x00c2, B:31:0x00cb, B:32:0x00d8, B:33:0x00d9, B:35:0x00e1, B:37:0x00f0, B:39:0x00fa, B:41:0x012b, B:44:0x0133, B:46:0x0138, B:48:0x013e, B:51:0x0146, B:54:0x014e, B:62:0x015c, B:64:0x0162, B:66:0x0168, B:68:0x016e, B:70:0x0174, B:72:0x017a, B:74:0x0180, B:76:0x0186, B:79:0x018e, B:87:0x019c, B:89:0x01a9, B:91:0x0212, B:93:0x022c, B:98:0x02a8, B:102:0x02bf, B:107:0x02cd, B:113:0x02eb, B:120:0x02ff, B:127:0x0314, B:128:0x0319, B:136:0x032d, B:144:0x0354, B:145:0x0359, B:148:0x035d, B:161:0x0394, B:163:0x039a, B:165:0x03a6, B:167:0x03af, B:169:0x03b9, B:171:0x03c2, B:173:0x03cc, B:175:0x03d5, B:177:0x03df, B:179:0x03e8, B:181:0x03f2, B:183:0x03fb, B:185:0x0405, B:187:0x040e, B:189:0x0415, B:191:0x041b, B:192:0x0427, B:193:0x042a, B:194:0x042f, B:195:0x0430, B:203:0x0446, B:196:0x0433, B:197:0x0436, B:198:0x0439, B:199:0x043c, B:200:0x043f, B:152:0x036d, B:153:0x0372, B:154:0x0373, B:158:0x0389, B:159:0x038e, B:160:0x038f, B:139:0x0345, B:130:0x031c, B:132:0x0324, B:133:0x0327, B:135:0x032b, B:204:0x0459, B:205:0x045e, B:114:0x02ee, B:115:0x02f3, B:116:0x02f4, B:117:0x02f7, B:118:0x02fa, B:119:0x02fd, B:103:0x02c2, B:104:0x02c7, B:105:0x02c8, B:106:0x02cb, B:95:0x0277, B:97:0x027b, B:206:0x045f, B:207:0x0464, B:45:0x0136, B:208:0x0465, B:209:0x0473, B:210:0x0474, B:211:0x0482, B:19:0x008a, B:20:0x008f, B:21:0x0090, B:212:0x0483, B:215:0x0492), top: B:231:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:133:0x0327 A[Catch: Exception -> 0x0058, c -> 0x005b, CancellationException -> 0x005e, TryCatch #3 {Exception -> 0x0058, blocks: (B:3:0x0006, B:5:0x004f, B:12:0x0061, B:14:0x006b, B:15:0x006d, B:18:0x0087, B:22:0x0092, B:24:0x00ad, B:26:0x00b3, B:28:0x00c2, B:31:0x00cb, B:32:0x00d8, B:33:0x00d9, B:35:0x00e1, B:37:0x00f0, B:39:0x00fa, B:41:0x012b, B:44:0x0133, B:46:0x0138, B:48:0x013e, B:51:0x0146, B:54:0x014e, B:62:0x015c, B:64:0x0162, B:66:0x0168, B:68:0x016e, B:70:0x0174, B:72:0x017a, B:74:0x0180, B:76:0x0186, B:79:0x018e, B:87:0x019c, B:89:0x01a9, B:91:0x0212, B:93:0x022c, B:98:0x02a8, B:102:0x02bf, B:107:0x02cd, B:113:0x02eb, B:120:0x02ff, B:127:0x0314, B:128:0x0319, B:136:0x032d, B:144:0x0354, B:145:0x0359, B:148:0x035d, B:161:0x0394, B:163:0x039a, B:165:0x03a6, B:167:0x03af, B:169:0x03b9, B:171:0x03c2, B:173:0x03cc, B:175:0x03d5, B:177:0x03df, B:179:0x03e8, B:181:0x03f2, B:183:0x03fb, B:185:0x0405, B:187:0x040e, B:189:0x0415, B:191:0x041b, B:192:0x0427, B:193:0x042a, B:194:0x042f, B:195:0x0430, B:203:0x0446, B:196:0x0433, B:197:0x0436, B:198:0x0439, B:199:0x043c, B:200:0x043f, B:152:0x036d, B:153:0x0372, B:154:0x0373, B:158:0x0389, B:159:0x038e, B:160:0x038f, B:139:0x0345, B:130:0x031c, B:132:0x0324, B:133:0x0327, B:135:0x032b, B:204:0x0459, B:205:0x045e, B:114:0x02ee, B:115:0x02f3, B:116:0x02f4, B:117:0x02f7, B:118:0x02fa, B:119:0x02fd, B:103:0x02c2, B:104:0x02c7, B:105:0x02c8, B:106:0x02cb, B:95:0x0277, B:97:0x027b, B:206:0x045f, B:207:0x0464, B:45:0x0136, B:208:0x0465, B:209:0x0473, B:210:0x0474, B:211:0x0482, B:19:0x008a, B:20:0x008f, B:21:0x0090, B:212:0x0483, B:215:0x0492), top: B:231:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:135:0x032b A[Catch: Exception -> 0x0058, c -> 0x005b, CancellationException -> 0x005e, TryCatch #3 {Exception -> 0x0058, blocks: (B:3:0x0006, B:5:0x004f, B:12:0x0061, B:14:0x006b, B:15:0x006d, B:18:0x0087, B:22:0x0092, B:24:0x00ad, B:26:0x00b3, B:28:0x00c2, B:31:0x00cb, B:32:0x00d8, B:33:0x00d9, B:35:0x00e1, B:37:0x00f0, B:39:0x00fa, B:41:0x012b, B:44:0x0133, B:46:0x0138, B:48:0x013e, B:51:0x0146, B:54:0x014e, B:62:0x015c, B:64:0x0162, B:66:0x0168, B:68:0x016e, B:70:0x0174, B:72:0x017a, B:74:0x0180, B:76:0x0186, B:79:0x018e, B:87:0x019c, B:89:0x01a9, B:91:0x0212, B:93:0x022c, B:98:0x02a8, B:102:0x02bf, B:107:0x02cd, B:113:0x02eb, B:120:0x02ff, B:127:0x0314, B:128:0x0319, B:136:0x032d, B:144:0x0354, B:145:0x0359, B:148:0x035d, B:161:0x0394, B:163:0x039a, B:165:0x03a6, B:167:0x03af, B:169:0x03b9, B:171:0x03c2, B:173:0x03cc, B:175:0x03d5, B:177:0x03df, B:179:0x03e8, B:181:0x03f2, B:183:0x03fb, B:185:0x0405, B:187:0x040e, B:189:0x0415, B:191:0x041b, B:192:0x0427, B:193:0x042a, B:194:0x042f, B:195:0x0430, B:203:0x0446, B:196:0x0433, B:197:0x0436, B:198:0x0439, B:199:0x043c, B:200:0x043f, B:152:0x036d, B:153:0x0372, B:154:0x0373, B:158:0x0389, B:159:0x038e, B:160:0x038f, B:139:0x0345, B:130:0x031c, B:132:0x0324, B:133:0x0327, B:135:0x032b, B:204:0x0459, B:205:0x045e, B:114:0x02ee, B:115:0x02f3, B:116:0x02f4, B:117:0x02f7, B:118:0x02fa, B:119:0x02fd, B:103:0x02c2, B:104:0x02c7, B:105:0x02c8, B:106:0x02cb, B:95:0x0277, B:97:0x027b, B:206:0x045f, B:207:0x0464, B:45:0x0136, B:208:0x0465, B:209:0x0473, B:210:0x0474, B:211:0x0482, B:19:0x008a, B:20:0x008f, B:21:0x0090, B:212:0x0483, B:215:0x0492), top: B:231:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:204:0x0459 A[Catch: Exception -> 0x0058, c -> 0x005b, CancellationException -> 0x005e, TryCatch #3 {Exception -> 0x0058, blocks: (B:3:0x0006, B:5:0x004f, B:12:0x0061, B:14:0x006b, B:15:0x006d, B:18:0x0087, B:22:0x0092, B:24:0x00ad, B:26:0x00b3, B:28:0x00c2, B:31:0x00cb, B:32:0x00d8, B:33:0x00d9, B:35:0x00e1, B:37:0x00f0, B:39:0x00fa, B:41:0x012b, B:44:0x0133, B:46:0x0138, B:48:0x013e, B:51:0x0146, B:54:0x014e, B:62:0x015c, B:64:0x0162, B:66:0x0168, B:68:0x016e, B:70:0x0174, B:72:0x017a, B:74:0x0180, B:76:0x0186, B:79:0x018e, B:87:0x019c, B:89:0x01a9, B:91:0x0212, B:93:0x022c, B:98:0x02a8, B:102:0x02bf, B:107:0x02cd, B:113:0x02eb, B:120:0x02ff, B:127:0x0314, B:128:0x0319, B:136:0x032d, B:144:0x0354, B:145:0x0359, B:148:0x035d, B:161:0x0394, B:163:0x039a, B:165:0x03a6, B:167:0x03af, B:169:0x03b9, B:171:0x03c2, B:173:0x03cc, B:175:0x03d5, B:177:0x03df, B:179:0x03e8, B:181:0x03f2, B:183:0x03fb, B:185:0x0405, B:187:0x040e, B:189:0x0415, B:191:0x041b, B:192:0x0427, B:193:0x042a, B:194:0x042f, B:195:0x0430, B:203:0x0446, B:196:0x0433, B:197:0x0436, B:198:0x0439, B:199:0x043c, B:200:0x043f, B:152:0x036d, B:153:0x0372, B:154:0x0373, B:158:0x0389, B:159:0x038e, B:160:0x038f, B:139:0x0345, B:130:0x031c, B:132:0x0324, B:133:0x0327, B:135:0x032b, B:204:0x0459, B:205:0x045e, B:114:0x02ee, B:115:0x02f3, B:116:0x02f4, B:117:0x02f7, B:118:0x02fa, B:119:0x02fd, B:103:0x02c2, B:104:0x02c7, B:105:0x02c8, B:106:0x02cb, B:95:0x0277, B:97:0x027b, B:206:0x045f, B:207:0x0464, B:45:0x0136, B:208:0x0465, B:209:0x0473, B:210:0x0474, B:211:0x0482, B:19:0x008a, B:20:0x008f, B:21:0x0090, B:212:0x0483, B:215:0x0492), top: B:231:0x0006 }] */
    public final dx.i<dx.b, BEPassportChildApplicationXmlRequest> g(xw.e childGender, y91.c.SummaryContractData contractData, BEPassportChildApplicationAttachments attachments) {
        Object objB;
        cl0.c cVar;
        LocalDate date;
        BEPassportChildApplicationCorrespondenceAddress bEPassportChildApplicationCorrespondenceAddress;
        f0 f0Var;
        cl0.t tVar;
        i61.q paymentType;
        cl0.u uVar;
        boolean z15;
        Boolean boolValueOf;
        BEPassportChildApplicationXmlRequestPassportDocumentVisualizationData bEPassportChildApplicationXmlRequestPassportDocumentVisualizationData;
        h0 h0Var;
        PhoneNumber phoneNumber;
        b0 b0VarG;
        PhoneNumber phoneNumber2;
        String strF;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    b0 firstName = contractData.getParentData().getParentData().getFirstName();
                    b0 secondName = contractData.getParentData().getParentData().getSecondName();
                    b0 surname = contractData.getParentData().getParentData().getSurname();
                    b0 b0VarC = xw.g.c(contractData.getParentData().getParentData().getPesel());
                    b0 idCardSeriesAndNumber = contractData.getParentData().getParentData().getIdCardSeriesAndNumber();
                    if (idCardSeriesAndNumber == null) {
                        idCardSeriesAndNumber = contractData.getParentData().getIdCardSeriesAndNumberFieldValue();
                    }
                    cl0.d documentType = contractData.getParentData().getDocumentType();
                    if (documentType == null) {
                        documentType = cl0.d.ID_CARD;
                    }
                    b0 idCardNameFieldValue = contractData.getParentData().getIdCardNameFieldValue();
                    i61.t whoAgrees = contractData.getWhoAgrees();
                    int[] iArr = b.f116371a;
                    int i15 = iArr[whoAgrees.ordinal()];
                    boolean z16 = true;
                    if (i15 == 1) {
                        cVar = cl0.c.PARENT;
                    } else {
                        if (i15 != 2) {
                            throw new oq.p();
                        }
                        cVar = cl0.c.GUARDIAN;
                    }
                    BEChildPassportApplicationApplicant bEChildPassportApplicationApplicant = new BEChildPassportApplicationApplicant(firstName, secondName, surname, b0VarC, idCardSeriesAndNumber, documentType, idCardNameFieldValue, cVar, contractData.getParentData().getParentData().getChecksum(), null);
                    fz.b.LocalDate birthDate = contractData.getChildData().getBirthDate();
                    if (birthDate == null || (date = birthDate.getDate()) == null) {
                        aVar.b(new dx.b.Parsing(null, 1, null));
                        throw new oq.g();
                    }
                    fz.b.LocalDate localDate = new fz.b.LocalDate(date);
                    b0 birthPlace = contractData.getChildData().getBirthPlace();
                    if (birthPlace == null && (birthPlace = contractData.getBirthPlaceInput()) == null) {
                        aVar.b(new dx.b.Parsing(null, 1, null));
                        throw new oq.g();
                    }
                    b0 b0Var = birthPlace;
                    b0 checksum = contractData.getChildData() instanceof PassportChildApplicationGetChildData ? ((PassportChildApplicationGetChildData) contractData.getChildData()).getChecksum() : null;
                    b0 firstName2 = contractData.getChildData().getFirstName();
                    if (childGender == null) {
                        aVar.b(new dx.b.Parsing(null, 1, null));
                        throw new oq.g();
                    }
                    BEPassportChildApplicationChild bEPassportChildApplicationChild = new BEPassportChildApplicationChild(localDate, b0Var, checksum, firstName2, childGender, contractData.getChildData().getLastName(), true, contractData.getChildData().getOtherName(), contractData.getChildData().getPesel(), contractData.getChildData().getSecondName());
                    ContactDetailsData contactData = contractData.getContactData();
                    cl0.m mVar = (contactData != null ? contactData.getEmailAddress() : null) == null ? cl0.m.POST : cl0.m.PHONE_AND_EMAIL;
                    ContactDetailsData contactData2 = contractData.getContactData();
                    b0 emailAddress = contactData2 != null ? contactData2.getEmailAddress() : null;
                    String strE = emailAddress != null ? c0.e(emailAddress) : null;
                    if (strE == null || fu.r.t0(strE)) {
                        emailAddress = null;
                    }
                    ContactDetailsData contactData3 = contractData.getContactData();
                    b0 b0VarG2 = (contactData3 == null || (phoneNumber2 = contactData3.getPhoneNumber()) == null || (strF = phoneNumber2.f()) == null) ? null : c0.g(strF);
                    ContactDetailsData contactData4 = contractData.getContactData();
                    String strE2 = (contactData4 == null || (phoneNumber = contactData4.getPhoneNumber()) == null || (b0VarG = phoneNumber.g()) == null) ? null : c0.e(b0VarG);
                    if (strE2 == null || fu.r.t0(strE2)) {
                        b0VarG2 = null;
                    }
                    BEPassportChildApplicationContact bEPassportChildApplicationContact = new BEPassportChildApplicationContact(mVar, emailAddress, b0VarG2);
                    i61.d correspondenceAddress = contractData.getCorrespondenceAddress();
                    if (correspondenceAddress instanceof i61.d.Domestic) {
                        BEPassportChildApplicationPolishCorrespondenceAddressCity bEPassportChildApplicationPolishCorrespondenceAddressCity = new BEPassportChildApplicationPolishCorrespondenceAddressCity(c0.g(((i61.d.Domestic) correspondenceAddress).getAddressData().getCommunity().getName()), c0.g(((i61.d.Domestic) correspondenceAddress).getAddressData().getCity().getName()), c0.g(((i61.d.Domestic) correspondenceAddress).getAddressData().getCity().getId()));
                        b0 b0VarG3 = c0.g(((i61.d.Domestic) correspondenceAddress).getAddressData().getBuildingNumber());
                        b0 b0VarG4 = c0.g(((i61.d.Domestic) correspondenceAddress).getAddressData().getPostalCode());
                        AddressTerytDetail street = ((i61.d.Domestic) correspondenceAddress).getAddressData().getStreet();
                        bEPassportChildApplicationCorrespondenceAddress = new BEPassportChildApplicationCorrespondenceAddress(null, new BEPassportChildApplicationPolishCorrespondenceAddress(bEPassportChildApplicationPolishCorrespondenceAddressCity, b0VarG3, b0VarG4, street != null ? new BEPassportChildApplicationPolishCorrespondenceAddressStreet(c0.g(street.getName()), c0.g(street.getId())) : null, new BEPassportChildApplicationPolishCorrespondenceAddressVoivodeship(c0.g(((i61.d.Domestic) correspondenceAddress).getAddressData().getProvince().getName()), c0.g(((i61.d.Domestic) correspondenceAddress).getAddressData().getProvince().getId())), c0.g(((i61.d.Domestic) correspondenceAddress).getAddressData().getApartmentNumber())));
                    } else {
                        if (!(correspondenceAddress instanceof i61.d.Foreign)) {
                            throw new oq.p();
                        }
                        bEPassportChildApplicationCorrespondenceAddress = new BEPassportChildApplicationCorrespondenceAddress(new BEPassportChildApplicationForeignCorrespondenceAddress(c0.g(((i61.d.Foreign) correspondenceAddress).getAddress()), c0.g(contractData.getCorrespondenceCountry().getName()), c0.g(contractData.getCorrespondenceCountry().getIsoCode())), null);
                    }
                    boolean firstEServiceAttempt = contractData.getFirstEServiceAttempt();
                    int i16 = b.f116372b[contractData.getPassportOfficePlace().ordinal()];
                    if (i16 == 1) {
                        f0Var = f0.POLAND;
                    } else if (i16 == 2) {
                        f0Var = f0.ABROAD;
                    } else {
                        if (i16 != 3) {
                            throw new oq.p();
                        }
                        f0Var = f0.UNKNOWN;
                    }
                    s0 passportType = contractData.getPassportType();
                    i61.l discountType = contractData.getDiscountType();
                    int[] iArr2 = b.f116373c;
                    int i17 = iArr2[discountType.ordinal()];
                    if (i17 == 1) {
                        tVar = cl0.t.SCHOOL;
                    } else if (i17 == 2) {
                        tVar = cl0.t.LARGE_FAMILY;
                    } else if (i17 == 3) {
                        tVar = cl0.t.TECHNICAL_ISSUE;
                    } else if (i17 == 4) {
                        tVar = cl0.t.TREATMENT;
                    } else {
                        if (i17 != 5) {
                            throw new oq.p();
                        }
                        tVar = cl0.t.TEMPORARY_PASSPORT;
                    }
                    int i18 = iArr2[contractData.getDiscountType().ordinal()];
                    if (i18 == 1 || i18 == 2) {
                        paymentType = contractData.getPaymentType();
                        if (paymentType instanceof i61.q.b) {
                            uVar = cl0.u.BANK_OR_POSTAL_TRANSFER;
                        } else {
                            if (paymentType instanceof i61.q.a) {
                                throw new oq.p();
                            }
                            uVar = cl0.u.ONLINE;
                        }
                    } else if (i18 == 3 || i18 == 4) {
                        uVar = null;
                    } else {
                        if (i18 != 5) {
                            throw new oq.p();
                        }
                        paymentType = contractData.getPaymentType();
                        if (paymentType instanceof i61.q.b) {
                            uVar = cl0.u.BANK_OR_POSTAL_TRANSFER;
                        } else {
                            if (paymentType instanceof i61.q.a) {
                                throw new oq.p();
                            }
                            uVar = cl0.u.ONLINE;
                        }
                    }
                    BEPassportChildApplicationPayment bEPassportChildApplicationPayment = new BEPassportChildApplicationPayment(tVar, uVar);
                    b0 b0VarG5 = c0.g(contractData.getInstitutionData().getUnitCode());
                    i61.r pickUpMethod = contractData.getPickUpMethod();
                    int i19 = pickUpMethod == null ? -1 : b.f116374d[pickUpMethod.ordinal()];
                    if (i19 == -1) {
                        z15 = false;
                    } else if (i19 == 1) {
                        z15 = true;
                    } else {
                        if (i19 != 2) {
                            throw new oq.p();
                        }
                        z15 = false;
                    }
                    int i25 = iArr[contractData.getWhoAgrees().ordinal()];
                    if (i25 == 1) {
                        int i26 = b.f116375e[contractData.getChildData().getEntryType().ordinal()];
                        if (i26 != 1) {
                            if (i26 != 2) {
                                throw new oq.p();
                            }
                            z16 = false;
                        }
                        boolValueOf = Boolean.valueOf(z16);
                    } else {
                        if (i25 != 2) {
                            throw new oq.p();
                        }
                        boolValueOf = null;
                    }
                    if (contractData.getDataSplitData() != null) {
                        DataSplit birthPlace2 = contractData.getDataSplitData().getBirthPlace();
                        b0 firstLine = birthPlace2 != null ? birthPlace2.getFirstLine() : null;
                        DataSplit birthPlace3 = contractData.getDataSplitData().getBirthPlace();
                        b0 secondLine = birthPlace3 != null ? birthPlace3.getSecondLine() : null;
                        DataSplit names = contractData.getDataSplitData().getNames();
                        b0 firstLine2 = names != null ? names.getFirstLine() : null;
                        DataSplit names2 = contractData.getDataSplitData().getNames();
                        b0 secondLine2 = names2 != null ? names2.getSecondLine() : null;
                        DataSplit surname2 = contractData.getDataSplitData().getSurname();
                        b0 firstLine3 = surname2 != null ? surname2.getFirstLine() : null;
                        DataSplit surname3 = contractData.getDataSplitData().getSurname();
                        bEPassportChildApplicationXmlRequestPassportDocumentVisualizationData = new BEPassportChildApplicationXmlRequestPassportDocumentVisualizationData(firstLine, secondLine, firstLine2, secondLine2, firstLine3, surname3 != null ? surname3.getSecondLine() : null);
                    } else {
                        bEPassportChildApplicationXmlRequestPassportDocumentVisualizationData = null;
                    }
                    if (contractData.getReasonType() != null) {
                        switch (b.f116376f[contractData.getReasonType().ordinal()]) {
                            case 1:
                                h0Var = h0.MEDICAL_EMERGENCY;
                                break;
                            case 2:
                                h0Var = h0.WORK_EMERGENCY;
                                break;
                            case 3:
                                h0Var = h0.PERMANENT_RESIDENCE_RETURN;
                                break;
                            case 4:
                                h0Var = h0.LEARN_OBLIGATION_AND_SKILLS_DEVELOPMENT;
                                break;
                            case 5:
                                h0Var = h0.PASSPORT_AWAIT;
                                break;
                            case 6:
                                h0Var = h0.FUNERAL;
                                break;
                            default:
                                throw new oq.p();
                        }
                    } else {
                        h0Var = null;
                    }
                    return new dx.i.Right(new BEPassportChildApplicationXmlRequest(bEChildPassportApplicationApplicant, bEPassportChildApplicationChild, bEPassportChildApplicationContact, bEPassportChildApplicationCorrespondenceAddress, firstEServiceAttempt, f0Var, passportType, bEPassportChildApplicationPayment, b0VarG5, z15, attachments, boolValueOf, bEPassportChildApplicationXmlRequestPassportDocumentVisualizationData, h0Var));
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
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
            return new dx.i.Left(objB);
        }
    }

    public Object h(Params params, tq.e<? super dx.i<? extends k44.a, ry.a>> eVar) {
        return this.callActionWithEdorAuthTokenUC.a(new c(params, null), eVar);
    }
}
