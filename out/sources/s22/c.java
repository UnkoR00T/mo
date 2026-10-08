package s22;

import eo0.DeliveryMessageDetails;
import eo0.DeliveryMessageDetailsAttachment;
import eo0.DraftDetails;
import eo0.EpuapApplicationType;
import eo0.y;
import fo0.DeliveryMessageAddress;
import fr.t;
import fu.r;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import o02.Epuap;
import p02.s;
import p071kotlin.Metadata;
import pq.v;
import r22.State;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 #2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002 \u001eB!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f*\u00020\f2\b\b\u0001\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0012*\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\r*\u00020\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u000f*\u00020\u000fH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\"¨\u0006$"}, d2 = {"Ls22/c;", "Lxw/f;", "Ls22/c$b;", "Lr22/c;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "Lp02/s;", "getMessageDateTimeUC", "<init>", "(Lmx/c;Lez/e;Lp02/s;)V", "Leo0/m;", "", "headerRes", "", "i", "(Leo0/m;I)Ljava/lang/String;", "", "Leo0/n;", "Lm02/c$b;", "h", "(Ljava/util/List;)Ljava/util/List;", "f", "(Ljava/lang/String;)I", "e", "(Ljava/lang/String;)Ljava/lang/String;", "params", "c", "(Ls22/c$b;)Lr22/c;", "a", "Lmx/c;", "b", "Lez/e;", "Lp02/s;", "d", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements xw.f<Params, State> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f177642e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final s getMessageDateTimeUC;

    /* JADX INFO: renamed from: s22.c$b, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Ls22/c$b;", "", "Lz02/a;", "entryMessageType", "Lo02/d;", "stepResult", "<init>", "(Lz02/a;Lo02/d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lz02/a;", "()Lz02/a;", "b", "Lo02/d;", "()Lo02/d;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final z02.a entryMessageType;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Epuap stepResult;

        public Params(z02.a aVar, Epuap epuap) {
            this.entryMessageType = aVar;
            this.stepResult = epuap;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final z02.a getEntryMessageType() {
            return this.entryMessageType;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Epuap getStepResult() {
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
            return t.c(this.entryMessageType, params.entryMessageType) && t.c(this.stepResult, params.stepResult);
        }

        public int hashCode() {
            int iHashCode = this.entryMessageType.hashCode() * 31;
            Epuap epuap = this.stepResult;
            return iHashCode + (epuap == null ? 0 : epuap.hashCode());
        }

        public String toString() {
            return "Params(entryMessageType=" + this.entryMessageType + ", stepResult=" + this.stepResult + ')';
        }
    }

    public c(mx.c cVar, ez.e eVar, s sVar) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
        this.getMessageDateTimeUC = sVar;
    }

    private final String e(String str) {
        if (str.length() <= 250) {
            return str;
        }
        return r.B1(str, f(str)) + this.labelProvider.c(c20.f.f22753a).getText();
    }

    private final int f(String str) {
        return (str.length() + this.labelProvider.c(c20.f.f22753a).getText().length()) - 250;
    }

    private final List<m02.c.UploadedFilePlaceholder> h(List<DeliveryMessageDetailsAttachment> list) {
        List<DeliveryMessageDetailsAttachment> list2 = list;
        ArrayList arrayList = new ArrayList(v.y(list2, 10));
        for (DeliveryMessageDetailsAttachment deliveryMessageDetailsAttachment : list2) {
            arrayList.add(new m02.c.UploadedFilePlaceholder(y.b(deliveryMessageDetailsAttachment.getAttachmentId()), deliveryMessageDetailsAttachment.getFileName(), deliveryMessageDetailsAttachment.getFileSize(), null));
        }
        return arrayList;
    }

    private final String i(DeliveryMessageDetails deliveryMessageDetails, int i15) {
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
        return this.labelProvider.c(i15).getText() + '\n' + this.labelProvider.c(e02.a.D2).getText() + ": " + name + '\n' + this.labelProvider.c(e02.a.A4).getText() + ": " + name2 + '\n' + this.labelProvider.c(e02.a.f46499a2).getText() + ' ' + strD + '\n' + this.labelProvider.c(e02.a.Z1).getText() + ' ' + str + '\n' + str2 + "\n------------------------";
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0181  */
    /* JADX WARN: Code duplicated, block: B:104:0x0187  */
    /* JADX WARN: Code duplicated, block: B:107:0x0194  */
    /* JADX WARN: Code duplicated, block: B:42:0x009d  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:67:0x0104  */
    /* JADX WARN: Code duplicated, block: B:71:0x010a  */
    /* JADX WARN: Code duplicated, block: B:75:0x0119  */
    /* JADX WARN: Code duplicated, block: B:77:0x011f  */
    /* JADX WARN: Code duplicated, block: B:79:0x0125  */
    /* JADX WARN: Code duplicated, block: B:81:0x0131  */
    /* JADX WARN: Code duplicated, block: B:84:0x013c  */
    /* JADX WARN: Code duplicated, block: B:85:0x014f  */
    /* JADX WARN: Code duplicated, block: B:87:0x0157  */
    /* JADX WARN: Code duplicated, block: B:96:0x016c  */
    /* JADX WARN: Code duplicated, block: B:97:0x0171  */
    /* JADX WARN: Code duplicated, block: B:99:0x0174  */
    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public State b(Params params) {
        State.Field field;
        State.Field field2;
        String strE;
        z02.a entryMessageType;
        Epuap stepResult;
        String content;
        State.Field field3;
        State.Field field4;
        Epuap stepResult2;
        String strI;
        z02.a entryMessageType2;
        Epuap stepResult3;
        List<m02.c> listN;
        Epuap stepResult4;
        EpuapApplicationType epuapApplicationType;
        Epuap stepResult5;
        String applicationName;
        Epuap stepResult6;
        DraftDetails draftDetails;
        List<DeliveryMessageDetailsAttachment> listA;
        Epuap stepResult7;
        String strI2;
        String strE2;
        z02.a entryMessageType3 = params.getEntryMessageType();
        z02.a entryMessageType4 = params.getEntryMessageType();
        State.Field field5 = null;
        if (!(entryMessageType4 instanceof z02.a.ForwardMessage)) {
            if (entryMessageType4 instanceof z02.a.Reply) {
                Epuap stepResult8 = params.getStepResult();
                if (stepResult8 == null || (strE = stepResult8.getTitle()) == null) {
                    String subject = ((z02.a.Reply) params.getEntryMessageType()).getMessageDetails().getDeliveryMessage().getSubject();
                    strE = subject != null ? e(subject) : "";
                }
                field2 = new State.Field(strE, null, 2, null);
            } else {
                if (!t.c(entryMessageType4, z02.a.c.f231893a) && !(entryMessageType4 instanceof z02.a.EditDraft)) {
                    throw new oq.p();
                }
                Epuap stepResult9 = params.getStepResult();
                String title = stepResult9 != null ? stepResult9.getTitle() : null;
                if (title == null) {
                    title = "";
                }
                field = new State.Field(title, null, 2, null);
            }
            entryMessageType = params.getEntryMessageType();
            if (entryMessageType instanceof z02.a.ForwardMessage) {
                if (entryMessageType instanceof z02.a.Reply) {
                    stepResult2 = params.getStepResult();
                    if (stepResult2 != null || (strI = stepResult2.getContent()) == null) {
                        strI = i(((z02.a.Reply) params.getEntryMessageType()).getMessageDetails(), e02.a.f46525e4);
                    }
                    field4 = new State.Field(strI, null, 2, null);
                } else {
                    if (t.c(entryMessageType, z02.a.c.f231893a) && !(entryMessageType instanceof z02.a.EditDraft)) {
                        throw new oq.p();
                    }
                    stepResult = params.getStepResult();
                    if (stepResult != null) {
                        content = stepResult.getContent();
                    } else {
                        content = null;
                    }
                    field3 = new State.Field(content != null ? content : "", null, 2, null);
                }
                entryMessageType2 = params.getEntryMessageType();
                if (entryMessageType2 instanceof z02.a.ForwardMessage) {
                    stepResult6 = params.getStepResult();
                    if (stepResult6 != null || (listN = stepResult6.d()) == null) {
                        draftDetails = ((z02.a.ForwardMessage) params.getEntryMessageType()).getDraftDetails();
                        if (draftDetails != null || (listA = draftDetails.a()) == null) {
                            listN = h(((z02.a.ForwardMessage) params.getEntryMessageType()).getMessageDetails().d());
                        } else {
                            listN = h(listA);
                        }
                    }
                } else {
                    if (t.c(entryMessageType2, z02.a.c.f231893a) && !(entryMessageType2 instanceof z02.a.EditDraft) && !(entryMessageType2 instanceof z02.a.Reply)) {
                        throw new oq.p();
                    }
                    stepResult3 = params.getStepResult();
                    if (stepResult3 != null) {
                        listN = stepResult3.d();
                    } else {
                        listN = null;
                    }
                    if (listN == null) {
                        listN = v.n();
                    }
                }
                State.Field field6 = new State.Field(listN, null, 2, null);
                stepResult4 = params.getStepResult();
                if (stepResult4 != null) {
                    epuapApplicationType = stepResult4.getEpuapApplicationType();
                } else {
                    epuapApplicationType = null;
                }
                State.Field field7 = new State.Field(epuapApplicationType, null, 2, null);
                stepResult5 = params.getStepResult();
                if (stepResult5 != null && (applicationName = stepResult5.getApplicationName()) != null) {
                    field5 = new State.Field(applicationName, null, 2, null);
                }
                return new State(null, field6, field7, field5, field, field3, null, entryMessageType3, 65, null);
            }
            stepResult7 = params.getStepResult();
            if (stepResult7 != null || (strI2 = stepResult7.getContent()) == null) {
                strI2 = i(((z02.a.ForwardMessage) params.getEntryMessageType()).getMessageDetails(), e02.a.C2);
            }
            field4 = new State.Field(strI2, null, 2, null);
            field3 = field4;
            entryMessageType2 = params.getEntryMessageType();
            if (entryMessageType2 instanceof z02.a.ForwardMessage) {
                stepResult6 = params.getStepResult();
                if (stepResult6 != null) {
                    draftDetails = ((z02.a.ForwardMessage) params.getEntryMessageType()).getDraftDetails();
                    if (draftDetails != null) {
                        listN = h(((z02.a.ForwardMessage) params.getEntryMessageType()).getMessageDetails().d());
                    } else {
                        listN = h(((z02.a.ForwardMessage) params.getEntryMessageType()).getMessageDetails().d());
                    }
                } else {
                    draftDetails = ((z02.a.ForwardMessage) params.getEntryMessageType()).getDraftDetails();
                    if (draftDetails != null) {
                        listN = h(((z02.a.ForwardMessage) params.getEntryMessageType()).getMessageDetails().d());
                    } else {
                        listN = h(((z02.a.ForwardMessage) params.getEntryMessageType()).getMessageDetails().d());
                    }
                }
            } else {
                if (t.c(entryMessageType2, z02.a.c.f231893a)) {
                }
                stepResult3 = params.getStepResult();
                if (stepResult3 != null) {
                    listN = stepResult3.d();
                } else {
                    listN = null;
                }
                if (listN == null) {
                    listN = v.n();
                }
            }
            State.Field field8 = new State.Field(listN, null, 2, null);
            stepResult4 = params.getStepResult();
            if (stepResult4 != null) {
                epuapApplicationType = stepResult4.getEpuapApplicationType();
            } else {
                epuapApplicationType = null;
            }
            State.Field field9 = new State.Field(epuapApplicationType, null, 2, null);
            stepResult5 = params.getStepResult();
            if (stepResult5 != null) {
                field5 = new State.Field(applicationName, null, 2, null);
            }
            return new State(null, field8, field9, field5, field, field3, null, entryMessageType3, 65, null);
        }
        Epuap stepResult10 = params.getStepResult();
        if (stepResult10 == null || (strE2 = stepResult10.getTitle()) == null) {
            String subject2 = ((z02.a.ForwardMessage) params.getEntryMessageType()).getMessageDetails().getDeliveryMessage().getSubject();
            strE2 = subject2 != null ? e(subject2) : "";
        }
        field2 = new State.Field(strE2, null, 2, null);
        field = field2;
        entryMessageType = params.getEntryMessageType();
        if (entryMessageType instanceof z02.a.ForwardMessage) {
            if (entryMessageType instanceof z02.a.Reply) {
                stepResult2 = params.getStepResult();
                if (stepResult2 != null) {
                    strI = i(((z02.a.Reply) params.getEntryMessageType()).getMessageDetails(), e02.a.f46525e4);
                } else {
                    strI = i(((z02.a.Reply) params.getEntryMessageType()).getMessageDetails(), e02.a.f46525e4);
                }
                field4 = new State.Field(strI, null, 2, null);
            } else {
                if (t.c(entryMessageType, z02.a.c.f231893a)) {
                }
                stepResult = params.getStepResult();
                if (stepResult != null) {
                    content = stepResult.getContent();
                } else {
                    content = null;
                }
                field3 = new State.Field(content != null ? content : "", null, 2, null);
            }
            entryMessageType2 = params.getEntryMessageType();
            if (entryMessageType2 instanceof z02.a.ForwardMessage) {
                stepResult6 = params.getStepResult();
                if (stepResult6 != null) {
                    draftDetails = ((z02.a.ForwardMessage) params.getEntryMessageType()).getDraftDetails();
                    if (draftDetails != null) {
                        listN = h(((z02.a.ForwardMessage) params.getEntryMessageType()).getMessageDetails().d());
                    } else {
                        listN = h(((z02.a.ForwardMessage) params.getEntryMessageType()).getMessageDetails().d());
                    }
                } else {
                    draftDetails = ((z02.a.ForwardMessage) params.getEntryMessageType()).getDraftDetails();
                    if (draftDetails != null) {
                        listN = h(((z02.a.ForwardMessage) params.getEntryMessageType()).getMessageDetails().d());
                    } else {
                        listN = h(((z02.a.ForwardMessage) params.getEntryMessageType()).getMessageDetails().d());
                    }
                }
            } else {
                if (t.c(entryMessageType2, z02.a.c.f231893a)) {
                }
                stepResult3 = params.getStepResult();
                if (stepResult3 != null) {
                    listN = stepResult3.d();
                } else {
                    listN = null;
                }
                if (listN == null) {
                    listN = v.n();
                }
            }
            State.Field field10 = new State.Field(listN, null, 2, null);
            stepResult4 = params.getStepResult();
            if (stepResult4 != null) {
                epuapApplicationType = stepResult4.getEpuapApplicationType();
            } else {
                epuapApplicationType = null;
            }
            State.Field field11 = new State.Field(epuapApplicationType, null, 2, null);
            stepResult5 = params.getStepResult();
            if (stepResult5 != null) {
                field5 = new State.Field(applicationName, null, 2, null);
            }
            return new State(null, field10, field11, field5, field, field3, null, entryMessageType3, 65, null);
        }
        stepResult7 = params.getStepResult();
        if (stepResult7 != null) {
            strI2 = i(((z02.a.ForwardMessage) params.getEntryMessageType()).getMessageDetails(), e02.a.C2);
        } else {
            strI2 = i(((z02.a.ForwardMessage) params.getEntryMessageType()).getMessageDetails(), e02.a.C2);
        }
        field4 = new State.Field(strI2, null, 2, null);
        field3 = field4;
        entryMessageType2 = params.getEntryMessageType();
        if (entryMessageType2 instanceof z02.a.ForwardMessage) {
            stepResult6 = params.getStepResult();
            if (stepResult6 != null) {
                draftDetails = ((z02.a.ForwardMessage) params.getEntryMessageType()).getDraftDetails();
                if (draftDetails != null) {
                    listN = h(((z02.a.ForwardMessage) params.getEntryMessageType()).getMessageDetails().d());
                } else {
                    listN = h(((z02.a.ForwardMessage) params.getEntryMessageType()).getMessageDetails().d());
                }
            } else {
                draftDetails = ((z02.a.ForwardMessage) params.getEntryMessageType()).getDraftDetails();
                if (draftDetails != null) {
                    listN = h(((z02.a.ForwardMessage) params.getEntryMessageType()).getMessageDetails().d());
                } else {
                    listN = h(((z02.a.ForwardMessage) params.getEntryMessageType()).getMessageDetails().d());
                }
            }
        } else {
            if (t.c(entryMessageType2, z02.a.c.f231893a)) {
            }
            stepResult3 = params.getStepResult();
            if (stepResult3 != null) {
                listN = stepResult3.d();
            } else {
                listN = null;
            }
            if (listN == null) {
                listN = v.n();
            }
        }
        State.Field field12 = new State.Field(listN, null, 2, null);
        stepResult4 = params.getStepResult();
        if (stepResult4 != null) {
            epuapApplicationType = stepResult4.getEpuapApplicationType();
        } else {
            epuapApplicationType = null;
        }
        State.Field field13 = new State.Field(epuapApplicationType, null, 2, null);
        stepResult5 = params.getStepResult();
        if (stepResult5 != null) {
            field5 = new State.Field(applicationName, null, 2, null);
        }
        return new State(null, field12, field13, field5, field, field3, null, entryMessageType3, 65, null);
    }
}
