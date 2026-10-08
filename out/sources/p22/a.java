package p22;

import eo0.DeliveryMessageDetails;
import eo0.DeliveryMessageDetailsAttachment;
import eo0.DraftDetails;
import eo0.j;
import eo0.y;
import ez.e;
import fo0.DeliveryMessageAddress;
import fr.t;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import oq.p;
import p02.s;
import p071kotlin.Metadata;
import pq.v;
import r22.State;
import xw.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u001e\u001cB)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000e*\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0017\u001a\u00020\u0016*\u00020\u00132\b\b\u0001\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010 R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lp22/a;", "Lxw/f;", "Lp22/a$b;", "Lo22/b;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "Lc12/a;", "edorMessageSubjectMapper", "Lp02/s;", "getMessageDateTimeUC", "<init>", "(Lmx/c;Lez/e;Lc12/a;Lp02/s;)V", "", "Leo0/n;", "Lm02/c$b;", "e", "(Ljava/util/List;)Ljava/util/List;", "Leo0/m;", "", "headerRes", "", "f", "(Leo0/m;I)Ljava/lang/String;", "params", "c", "(Lp22/a$b;)Lo22/b;", "a", "Lmx/c;", "b", "Lez/e;", "Lc12/a;", "d", "Lp02/s;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, o22.b> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f151904f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e dateFormatter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final c12.a edorMessageSubjectMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final s getMessageDateTimeUC;

    /* JADX INFO: renamed from: p22.a$b, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lp22/a$b;", "", "Lz02/a;", "formEntryData", "Lo02/c;", "stepResult", "<init>", "(Lz02/a;Lo02/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lz02/a;", "()Lz02/a;", "b", "Lo02/c;", "()Lo02/c;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final z02.a formEntryData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final o02.c stepResult;

        public Params(z02.a aVar, o02.c cVar) {
            this.formEntryData = aVar;
            this.stepResult = cVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final z02.a getFormEntryData() {
            return this.formEntryData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final o02.c getStepResult() {
            return this.stepResult;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.formEntryData, params.formEntryData) && t.c(this.stepResult, params.stepResult);
        }

        public int hashCode() {
            int iHashCode = this.formEntryData.hashCode() * 31;
            o02.c cVar = this.stepResult;
            return iHashCode + (cVar == null ? 0 : cVar.hashCode());
        }

        public String toString() {
            return "Params(formEntryData=" + this.formEntryData + ", stepResult=" + this.stepResult + ')';
        }
    }

    public a(mx.c cVar, e eVar, c12.a aVar, s sVar) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
        this.edorMessageSubjectMapper = aVar;
        this.getMessageDateTimeUC = sVar;
    }

    private final List<m02.c.UploadedFilePlaceholder> e(List<DeliveryMessageDetailsAttachment> list) {
        List<DeliveryMessageDetailsAttachment> list2 = list;
        ArrayList arrayList = new ArrayList(v.y(list2, 10));
        for (DeliveryMessageDetailsAttachment deliveryMessageDetailsAttachment : list2) {
            arrayList.add(new m02.c.UploadedFilePlaceholder(y.b(deliveryMessageDetailsAttachment.getAttachmentId()), deliveryMessageDetailsAttachment.getFileName(), deliveryMessageDetailsAttachment.getFileSize(), null));
        }
        return arrayList;
    }

    private final String f(DeliveryMessageDetails deliveryMessageDetails, int i15) {
        String name;
        String name2;
        String strD;
        String strD2;
        DeliveryMessageAddress deliveryMessageAddress;
        DeliveryMessageAddress from = deliveryMessageDetails.getDeliveryMessage().getFrom();
        if (from == null || (name = from.getName()) == null) {
            name = "";
        }
        List<DeliveryMessageAddress> listP = deliveryMessageDetails.getDeliveryMessage().p();
        if (listP == null || (deliveryMessageAddress = (DeliveryMessageAddress) v.n0(listP)) == null || (name2 = deliveryMessageAddress.getName()) == null) {
            name2 = "";
        }
        OffsetDateTime offsetDateTimeB = this.getMessageDateTimeUC.b(new s.Params(deliveryMessageDetails.getDeliveryMessage()));
        String str = "-";
        if (offsetDateTimeB == null || (strD = this.dateFormatter.d(new fz.b.OffsetDateTime(offsetDateTimeB), fz.c.DOTTED)) == null) {
            strD = "-";
        }
        String textBody = deliveryMessageDetails.getTextBody();
        String str2 = textBody != null ? textBody : "";
        OffsetDateTime receiptDate = deliveryMessageDetails.getDeliveryMessage().getReceiptDate();
        if (receiptDate != null && (strD2 = this.dateFormatter.d(new fz.b.OffsetDateTime(receiptDate), fz.c.DOTTED)) != null) {
            str = strD2;
        }
        return this.labelProvider.c(i15).getText() + '\n' + this.labelProvider.c(e02.a.D2).getText() + ": " + name + '\n' + this.labelProvider.c(e02.a.A4).getText() + ": " + name2 + '\n' + this.labelProvider.c(e02.a.f46499a2).getText() + ' ' + strD + '\n' + this.labelProvider.c(e02.a.f46523e2).getText() + ' ' + str + '\n' + str2 + "\n------------------------";
    }

    /* JADX WARN: Code duplicated, block: B:104:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:106:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:108:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:10:0x003d  */
    /* JADX WARN: Code duplicated, block: B:110:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:111:0x0203  */
    /* JADX WARN: Code duplicated, block: B:113:0x0207  */
    /* JADX WARN: Code duplicated, block: B:115:0x020d  */
    /* JADX WARN: Code duplicated, block: B:117:0x0213  */
    /* JADX WARN: Code duplicated, block: B:119:0x021f  */
    /* JADX WARN: Code duplicated, block: B:121:0x0226  */
    /* JADX WARN: Code duplicated, block: B:123:0x022e  */
    /* JADX WARN: Code duplicated, block: B:130:0x0243  */
    /* JADX WARN: Code duplicated, block: B:134:0x024f  */
    /* JADX WARN: Code duplicated, block: B:135:0x0262  */
    /* JADX WARN: Code duplicated, block: B:137:0x0266  */
    /* JADX WARN: Code duplicated, block: B:141:0x0272  */
    /* JADX WARN: Code duplicated, block: B:143:0x027e  */
    /* JADX WARN: Code duplicated, block: B:146:0x0289  */
    /* JADX WARN: Code duplicated, block: B:147:0x029c  */
    /* JADX WARN: Code duplicated, block: B:156:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:157:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:159:0x02be  */
    /* JADX WARN: Code duplicated, block: B:162:0x02db  */
    /* JADX WARN: Code duplicated, block: B:59:0x010d A[PHI: r1
      0x010d: PHI (r1v13 java.lang.String) = (r1v11 java.lang.String), (r1v12 java.lang.String), (r1v15 java.lang.String) binds: [B:67:0x012d, B:65:0x011d, B:57:0x010a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x0138  */
    /* JADX WARN: Code duplicated, block: B:73:0x013e  */
    /* JADX WARN: Code duplicated, block: B:75:0x0145  */
    /* JADX WARN: Code duplicated, block: B:77:0x0159  */
    /* JADX WARN: Code duplicated, block: B:78:0x0160  */
    /* JADX WARN: Code duplicated, block: B:80:0x0164  */
    /* JADX WARN: Code duplicated, block: B:82:0x016a  */
    /* JADX WARN: Code duplicated, block: B:83:0x016f  */
    /* JADX WARN: Code duplicated, block: B:85:0x0183  */
    /* JADX WARN: Code duplicated, block: B:86:0x018a  */
    /* JADX WARN: Code duplicated, block: B:88:0x0192  */
    /* JADX WARN: Code duplicated, block: B:90:0x0198  */
    /* JADX WARN: Code duplicated, block: B:91:0x019d  */
    /* JADX WARN: Code duplicated, block: B:92:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:94:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:96:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:97:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:99:0x01c7  */
    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public o22.b b(Params params) {
        String subject;
        String textBody;
        String str;
        z02.a formEntryData;
        o02.c stepResult;
        String caseId;
        o02.c stepResult2;
        o02.c stepResult3;
        o02.c stepResult4;
        z02.a formEntryData2;
        String messageId;
        o02.c stepResult5;
        DraftDetails draftDetails;
        o02.c stepResult6;
        z02.a formEntryData3;
        o02.c stepResult7;
        List<m02.c> listN;
        o02.c stepResult8;
        DraftDetails draftDetails2;
        List<DeliveryMessageDetailsAttachment> listA;
        o02.c stepResult9;
        o02.c stepResult10;
        z02.a formEntryData4 = params.getFormEntryData();
        z02.a formEntryData5 = params.getFormEntryData();
        String strF = "";
        if (formEntryData5 instanceof z02.a.ForwardMessage) {
            o02.c stepResult11 = params.getStepResult();
            if ((stepResult11 == null || (subject = stepResult11.getTitle()) == null) && (subject = this.edorMessageSubjectMapper.b(new c12.a.Params(((z02.a.ForwardMessage) params.getFormEntryData()).getMessageDetails().getDeliveryMessage().getSubject(), params.getFormEntryData()))) == null) {
                subject = "";
            }
        } else if (formEntryData5 instanceof z02.a.Reply) {
            o02.c stepResult12 = params.getStepResult();
            if ((stepResult12 == null || (subject = stepResult12.getTitle()) == null) && (subject = this.edorMessageSubjectMapper.b(new c12.a.Params(((z02.a.Reply) params.getFormEntryData()).getMessageDetails().getDeliveryMessage().getSubject(), params.getFormEntryData()))) == null) {
                subject = "";
            }
        } else if (t.c(formEntryData5, z02.a.c.f231893a)) {
            o02.c stepResult13 = params.getStepResult();
            if (stepResult13 == null || (subject = stepResult13.getTitle()) == null) {
                subject = "";
            }
        } else {
            if (!(formEntryData5 instanceof z02.a.EditDraft)) {
                throw new p();
            }
            o02.c stepResult14 = params.getStepResult();
            if ((stepResult14 == null || (subject = stepResult14.getTitle()) == null) && (subject = ((z02.a.EditDraft) params.getFormEntryData()).getMessageDetails().getDeliveryMessage().getSubject()) == null) {
                subject = "";
            }
        }
        z02.a formEntryData6 = params.getFormEntryData();
        if (formEntryData6 instanceof z02.a.ForwardMessage) {
            o02.c stepResult15 = params.getStepResult();
            if (stepResult15 == null || (strF = stepResult15.getContent()) == null) {
                strF = f(((z02.a.ForwardMessage) params.getFormEntryData()).getMessageDetails(), e02.a.C2);
            }
        } else {
            if (!(formEntryData6 instanceof z02.a.Reply)) {
                if (t.c(formEntryData6, z02.a.c.f231893a)) {
                    o02.c stepResult16 = params.getStepResult();
                    if (stepResult16 != null && (textBody = stepResult16.getContent()) != null) {
                        str = textBody;
                    }
                } else {
                    if (!(formEntryData6 instanceof z02.a.EditDraft)) {
                        throw new p();
                    }
                    o02.c stepResult17 = params.getStepResult();
                    if ((stepResult17 != null && (textBody = stepResult17.getContent()) != null) || (textBody = ((z02.a.EditDraft) params.getFormEntryData()).getMessageDetails().getTextBody()) != null) {
                        str = textBody;
                    }
                }
                formEntryData = params.getFormEntryData();
                if (formEntryData instanceof z02.a.ForwardMessage) {
                    stepResult10 = params.getStepResult();
                    if (stepResult10 != null) {
                        caseId = stepResult10.getCaseSign();
                    } else {
                        caseId = ((z02.a.ForwardMessage) params.getFormEntryData()).getMessageDetails().getDeliveryMessage().getCaseId();
                        if (caseId == null) {
                            caseId = j.INSTANCE.a();
                        }
                    }
                } else if (formEntryData instanceof z02.a.Reply) {
                    stepResult3 = params.getStepResult();
                    if (stepResult3 != null) {
                        caseId = stepResult3.getCaseSign();
                    } else {
                        caseId = ((z02.a.Reply) params.getFormEntryData()).getMessageDetails().getDeliveryMessage().getCaseId();
                        if (caseId == null) {
                            caseId = j.INSTANCE.a();
                        }
                    }
                } else if (t.c(formEntryData, z02.a.c.f231893a)) {
                    stepResult2 = params.getStepResult();
                    if (stepResult2 != null) {
                        caseId = stepResult2.getCaseSign();
                    } else {
                        caseId = j.INSTANCE.a();
                    }
                } else {
                    if (formEntryData instanceof z02.a.EditDraft) {
                        throw new p();
                    }
                    stepResult = params.getStepResult();
                    if (stepResult != null) {
                        caseId = stepResult.getCaseSign();
                    } else {
                        caseId = ((z02.a.EditDraft) params.getFormEntryData()).getMessageDetails().getDeliveryMessage().getCaseId();
                        if (caseId == null) {
                            caseId = j.INSTANCE.a();
                        }
                    }
                }
                String str2 = caseId;
                stepResult4 = params.getStepResult();
                if (stepResult4 != null || (messageId = stepResult4.getMessageId()) == null) {
                    formEntryData2 = params.getFormEntryData();
                    if (formEntryData2 instanceof z02.a.EditDraft) {
                        stepResult6 = params.getStepResult();
                        if (stepResult6 != null || (messageId = stepResult6.getMessageId()) == null) {
                            messageId = ((z02.a.EditDraft) params.getFormEntryData()).getMessageDetails().getDeliveryMessage().getMessageId();
                        }
                    } else {
                        if (formEntryData2 instanceof z02.a.ForwardMessage) {
                            stepResult5 = params.getStepResult();
                            if (stepResult5 != null || (messageId = stepResult5.getMessageId()) == null) {
                                draftDetails = ((z02.a.ForwardMessage) params.getFormEntryData()).getDraftDetails();
                                if (draftDetails != null) {
                                    messageId = draftDetails.getMessageId();
                                }
                            }
                        } else if (!t.c(formEntryData2, z02.a.c.f231893a) && !(formEntryData2 instanceof z02.a.Reply)) {
                            throw new p();
                        }
                        messageId = null;
                    }
                }
                formEntryData3 = params.getFormEntryData();
                if (formEntryData3 instanceof z02.a.EditDraft) {
                    stepResult9 = params.getStepResult();
                    if (stepResult9 != null || (listN = stepResult9.c()) == null) {
                        listN = e(((z02.a.EditDraft) params.getFormEntryData()).getMessageDetails().d());
                    }
                } else if (formEntryData3 instanceof z02.a.ForwardMessage) {
                    stepResult8 = params.getStepResult();
                    if (stepResult8 != null || (listN = stepResult8.c()) == null) {
                        draftDetails2 = ((z02.a.ForwardMessage) params.getFormEntryData()).getDraftDetails();
                        if (draftDetails2 != null || (listA = draftDetails2.a()) == null) {
                            listN = e(((z02.a.ForwardMessage) params.getFormEntryData()).getMessageDetails().d());
                        } else {
                            listN = e(listA);
                        }
                    }
                } else {
                    if (t.c(formEntryData3, z02.a.c.f231893a) && !(formEntryData3 instanceof z02.a.Reply)) {
                        throw new p();
                    }
                    stepResult7 = params.getStepResult();
                    if (stepResult7 != null) {
                        listN = stepResult7.c();
                    } else {
                        listN = null;
                    }
                    if (listN == null) {
                        listN = v.n();
                    }
                }
                return new o22.b(messageId, subject, str, str2, null, null, null, formEntryData4, null, null, new State.Field(v.i1(listN), null, 2, null), 880, null);
            }
            o02.c stepResult18 = params.getStepResult();
            if (stepResult18 == null || (strF = stepResult18.getContent()) == null) {
                strF = f(((z02.a.Reply) params.getFormEntryData()).getMessageDetails(), e02.a.f46525e4);
            }
        }
        str = strF;
        formEntryData = params.getFormEntryData();
        if (formEntryData instanceof z02.a.ForwardMessage) {
            stepResult10 = params.getStepResult();
            if (stepResult10 != null) {
                caseId = stepResult10.getCaseSign();
            } else {
                caseId = ((z02.a.ForwardMessage) params.getFormEntryData()).getMessageDetails().getDeliveryMessage().getCaseId();
                if (caseId == null) {
                    caseId = j.INSTANCE.a();
                }
            }
        } else if (formEntryData instanceof z02.a.Reply) {
            stepResult3 = params.getStepResult();
            if (stepResult3 != null) {
                caseId = stepResult3.getCaseSign();
            } else {
                caseId = ((z02.a.Reply) params.getFormEntryData()).getMessageDetails().getDeliveryMessage().getCaseId();
                if (caseId == null) {
                    caseId = j.INSTANCE.a();
                }
            }
        } else if (t.c(formEntryData, z02.a.c.f231893a)) {
            stepResult2 = params.getStepResult();
            if (stepResult2 != null) {
                caseId = stepResult2.getCaseSign();
            } else {
                caseId = j.INSTANCE.a();
            }
        } else {
            if (formEntryData instanceof z02.a.EditDraft) {
                throw new p();
            }
            stepResult = params.getStepResult();
            if (stepResult != null) {
                caseId = stepResult.getCaseSign();
            } else {
                caseId = ((z02.a.EditDraft) params.getFormEntryData()).getMessageDetails().getDeliveryMessage().getCaseId();
                if (caseId == null) {
                    caseId = j.INSTANCE.a();
                }
            }
        }
        String str3 = caseId;
        stepResult4 = params.getStepResult();
        if (stepResult4 != null) {
            formEntryData2 = params.getFormEntryData();
            if (formEntryData2 instanceof z02.a.EditDraft) {
                stepResult6 = params.getStepResult();
                if (stepResult6 != null) {
                    messageId = ((z02.a.EditDraft) params.getFormEntryData()).getMessageDetails().getDeliveryMessage().getMessageId();
                } else {
                    messageId = ((z02.a.EditDraft) params.getFormEntryData()).getMessageDetails().getDeliveryMessage().getMessageId();
                }
            } else {
                if (formEntryData2 instanceof z02.a.ForwardMessage) {
                    stepResult5 = params.getStepResult();
                    if (stepResult5 != null) {
                        draftDetails = ((z02.a.ForwardMessage) params.getFormEntryData()).getDraftDetails();
                        if (draftDetails != null) {
                            messageId = draftDetails.getMessageId();
                        }
                    } else {
                        draftDetails = ((z02.a.ForwardMessage) params.getFormEntryData()).getDraftDetails();
                        if (draftDetails != null) {
                            messageId = draftDetails.getMessageId();
                        }
                    }
                } else if (!t.c(formEntryData2, z02.a.c.f231893a)) {
                    throw new p();
                }
                messageId = null;
            }
        } else {
            formEntryData2 = params.getFormEntryData();
            if (formEntryData2 instanceof z02.a.EditDraft) {
                stepResult6 = params.getStepResult();
                if (stepResult6 != null) {
                    messageId = ((z02.a.EditDraft) params.getFormEntryData()).getMessageDetails().getDeliveryMessage().getMessageId();
                } else {
                    messageId = ((z02.a.EditDraft) params.getFormEntryData()).getMessageDetails().getDeliveryMessage().getMessageId();
                }
            } else {
                if (formEntryData2 instanceof z02.a.ForwardMessage) {
                    stepResult5 = params.getStepResult();
                    if (stepResult5 != null) {
                        draftDetails = ((z02.a.ForwardMessage) params.getFormEntryData()).getDraftDetails();
                        if (draftDetails != null) {
                            messageId = draftDetails.getMessageId();
                        }
                    } else {
                        draftDetails = ((z02.a.ForwardMessage) params.getFormEntryData()).getDraftDetails();
                        if (draftDetails != null) {
                            messageId = draftDetails.getMessageId();
                        }
                    }
                } else if (!t.c(formEntryData2, z02.a.c.f231893a)) {
                    throw new p();
                }
                messageId = null;
            }
        }
        formEntryData3 = params.getFormEntryData();
        if (formEntryData3 instanceof z02.a.EditDraft) {
            stepResult9 = params.getStepResult();
            if (stepResult9 != null) {
                listN = e(((z02.a.EditDraft) params.getFormEntryData()).getMessageDetails().d());
            } else {
                listN = e(((z02.a.EditDraft) params.getFormEntryData()).getMessageDetails().d());
            }
        } else if (formEntryData3 instanceof z02.a.ForwardMessage) {
            stepResult8 = params.getStepResult();
            if (stepResult8 != null) {
                draftDetails2 = ((z02.a.ForwardMessage) params.getFormEntryData()).getDraftDetails();
                if (draftDetails2 != null) {
                    listN = e(((z02.a.ForwardMessage) params.getFormEntryData()).getMessageDetails().d());
                } else {
                    listN = e(((z02.a.ForwardMessage) params.getFormEntryData()).getMessageDetails().d());
                }
            } else {
                draftDetails2 = ((z02.a.ForwardMessage) params.getFormEntryData()).getDraftDetails();
                if (draftDetails2 != null) {
                    listN = e(((z02.a.ForwardMessage) params.getFormEntryData()).getMessageDetails().d());
                } else {
                    listN = e(((z02.a.ForwardMessage) params.getFormEntryData()).getMessageDetails().d());
                }
            }
        } else {
            if (t.c(formEntryData3, z02.a.c.f231893a)) {
            }
            stepResult7 = params.getStepResult();
            if (stepResult7 != null) {
                listN = stepResult7.c();
            } else {
                listN = null;
            }
            if (listN == null) {
                listN = v.n();
            }
        }
        return new o22.b(messageId, subject, str, str3, null, null, null, formEntryData4, null, null, new State.Field(v.i1(listN), null, 2, null), 880, null);
    }
}
