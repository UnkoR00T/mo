package com.pl.pwpw.mobile.edoapp.edoLibrary.api;

import AUX.a;
import com.pl.pwpw.mobile.edoapp.edoLibrary.internals.model.dto.IcaoDto;
import com.pl.pwpw.mobile.edoapp.edoLibrary.internals.model.dto.RequestDetailsDto;
import com.pl.pwpw.mobile.edoapp.edoLibrary.internals.model.dto.RequestDetailsFields;
import com.pl.pwpw.mobile.edoapp.edoLibrary.messages.IncorrectPinErrorMessage;
import com.pl.pwpw.mobile.edoapp.edoLibrary.messages.ProcessErrorMessage;
import com.pl.pwpw.mobile.edoapp.edoLibrary.messages.ProcessFinishedMessage;
import com.pl.pwpw.mobile.edoapp.edoLibrary.messages.ProcessInfoMessage;
import com.pl.pwpw.mobile.edoapp.edoLibrary.messages.ProcessStartedMessage;
import dv.b;
import fr.q0;
import fr.t;
import fu.o;
import fu.r;
import gc.d;
import gc.f;
import hc.g;
import hc.i;
import hc.k;
import ic.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jc.c;
import ju.d2;
import oq.i0;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p005Con.g1;
import p005Con.j1;
import p013aUX.w0;
import p019auX.c1;
import p019auX.d1;
import p019auX.e1;
import p019auX.y0;
import p019auX.z0;
import p071kotlin.Metadata;
import pq.v;
import su.h;
import su.l;
import tq.e;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\nJ\u0015\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\nJ\u0015\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\nJ\u0015\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\nJ\"\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0086@¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\b¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/pl/pwpw/mobile/edoapp/edoLibrary/api/SmartAppService;", "Lcom/pl/pwpw/mobile/edoapp/edoLibrary/api/ITagDetected;", "Lcom/pl/pwpw/mobile/edoapp/edoLibrary/api/INfcService;", "nfcService", "<init>", "(Lcom/pl/pwpw/mobile/edoapp/edoLibrary/api/INfcService;)V", "", "can", "Loq/i0;", "setCan", "(Ljava/lang/String;)V", "pin", "setPin", "puk", "setPuk", "setNewPin", "dataToSign", "setDataToSign", "Lcom/pl/pwpw/mobile/edoapp/edoLibrary/api/RequestType;", "requestType", "Lcom/pl/pwpw/mobile/edoapp/edoLibrary/api/CertificateType;", "certificate", "initProcess", "(Lcom/pl/pwpw/mobile/edoapp/edoLibrary/api/RequestType;Lcom/pl/pwpw/mobile/edoapp/edoLibrary/api/CertificateType;Ltq/e;)Ljava/lang/Object;", "cancel", "()V", "tagDetected", "(Ltq/e;)Ljava/lang/Object;", "Companion", "edoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SmartAppService implements ITagDetected {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final INfcService f36900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f36901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f36902c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f36903d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f36904e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f36905f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f36906g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f36907h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f36908i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f36909j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final o f36910k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c f36911l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public RequestDetailsDto f36912m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public m f36913n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public AUX.c f36914o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final h f36915p;

    public SmartAppService(INfcService iNfcService) {
        this.f36900a = iNfcService;
        iNfcService.addListener(this);
        Messenger.INSTANCE.Instance().Register(q0.c(ProcessErrorMessage.class), new y0(this));
        this.f36901b = new i();
        this.f36902c = new a();
        this.f36904e = "";
        this.f36905f = "";
        this.f36906g = "";
        this.f36907h = "";
        this.f36908i = "";
        this.f36910k = new o("[0-9]+");
        this.f36915p = l.b(1, 0, 2, null);
    }

    public static final void access$onTimeout(SmartAppService smartAppService, ProcessErrorMessage processErrorMessage) {
        smartAppService.getClass();
        int code = processErrorMessage.getCode();
        b bVar = b.IncorrectCan;
        if (code == 21) {
            smartAppService.a();
            smartAppService.f36900a.stopListening();
        }
    }

    public static final void access$sendTimeoutMessage(SmartAppService smartAppService) {
        smartAppService.getClass();
        Messenger messengerInstance = Messenger.INSTANCE.Instance();
        b bVar = b.IncorrectCan;
        messengerInstance.Send(new ProcessErrorMessage("Session timeout", 21));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:107:0x0307  */
    /* JADX WARN: Code duplicated, block: B:110:0x030d  */
    /* JADX WARN: Code duplicated, block: B:114:0x031d  */
    /* JADX WARN: Code duplicated, block: B:116:0x0321 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:117:0x0323  */
    /* JADX WARN: Code duplicated, block: B:119:0x033e  */
    /* JADX WARN: Code duplicated, block: B:121:0x0342  */
    /* JADX WARN: Code duplicated, block: B:124:0x0363 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    public final Object a(RequestType requestType, CertificateType certificateType, e eVar) throws Throwable {
        d1 d1Var;
        RequestType requestType2;
        ArrayList arrayList;
        RequestType requestType3;
        CertificateType certificateType2 = certificateType;
        if (eVar instanceof d1) {
            d1Var = (d1) eVar;
            int i15 = d1Var.f14609f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                d1Var.f14609f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                d1Var = new d1(this, eVar);
            }
        } else {
            d1Var = new d1(this, eVar);
        }
        d1 d1Var2 = d1Var;
        Object obj = d1Var2.f14607d;
        Object objE = uq.b.e();
        int i16 = d1Var2.f14609f;
        if (i16 == 0) {
            u.b(obj);
            if (this.f36909j) {
                Messenger messengerInstance = Messenger.INSTANCE.Instance();
                b bVar = b.IncorrectCan;
                messengerInstance.Send(new ProcessErrorMessage("Process already in progress", 19));
                return i0.f148189a;
            }
            if (this.f36907h.length() == 0) {
                Messenger messengerInstance2 = Messenger.INSTANCE.Instance();
                b bVar2 = b.IncorrectCan;
                messengerInstance2.Send(new ProcessErrorMessage("Cannot initialize without CAN", 6));
                return i0.f148189a;
            }
            switch (z0.f14615a[requestType.ordinal()]) {
                case 1:
                    if (certificateType2 == null) {
                        Messenger messengerInstance3 = Messenger.INSTANCE.Instance();
                        String str = "Declared operation type: " + requestType.name() + " needs setting type of certificate";
                        b bVar3 = b.IncorrectCan;
                        messengerInstance3.Send(new ProcessErrorMessage(str, 8));
                    } else if (certificateType2 == CertificateType.PRESENCE) {
                        Messenger messengerInstance4 = Messenger.INSTANCE.Instance();
                        b bVar4 = b.IncorrectCan;
                        messengerInstance4.Send(new ProcessErrorMessage("Cannot initialize for the Presence certificate", 22));
                    } else if (!(this.f36904e.length() == 4 && this.f36905f.length() == 4) && certificateType2 == CertificateType.AUTHENTICATION) {
                        Messenger messengerInstance5 = Messenger.INSTANCE.Instance();
                        b bVar5 = b.IncorrectCan;
                        messengerInstance5.Send(new ProcessErrorMessage("Pin must consists of 4 digits for authentication certificate type.", 9));
                    } else {
                        if ((this.f36904e.length() != 6 || this.f36905f.length() != 6) && certificateType2 == CertificateType.AUTHORIZATION) {
                            Messenger messengerInstance6 = Messenger.INSTANCE.Instance();
                            b bVar6 = b.IncorrectCan;
                            messengerInstance6.Send(new ProcessErrorMessage("Pin must consists of 6 digits for authorization certificate type.", 10));
                        }
                        requestType2 = RequestType.READ_ICAO;
                        if (requestType != requestType2 || requestType == RequestType.READ_PHOTO) {
                            certificateType2 = null;
                        }
                        CertificateType certificateType3 = certificateType2;
                        String str2 = this.f36908i;
                        arrayList = new ArrayList();
                        if (requestType != RequestType.SIGN) {
                            requestType3 = RequestType.READ_ALL_DATA;
                            if (requestType != requestType3 || requestType == requestType2) {
                                arrayList.add("DG1");
                                arrayList.add("DG11");
                                arrayList.add("DG12");
                                arrayList.add("DG13");
                                arrayList.add("SOD");
                            }
                            if (requestType != requestType3 || requestType == RequestType.READ_PHOTO) {
                                arrayList.add("DG2");
                            }
                        }
                        this.f36912m = new RequestDetailsDto(new RequestDetailsFields(arrayList), requestType, str2, certificateType3, v.n());
                        this.f36909j = true;
                        d1Var2.f14609f = 1;
                        if (a(600) == objE) {
                            return objE;
                        }
                    }
                    return i0.f148189a;
                case 2:
                    if (certificateType2 == null) {
                        Messenger messengerInstance7 = Messenger.INSTANCE.Instance();
                        String str3 = "Declared operation type: " + requestType.name() + " needs setting type of certificate";
                        b bVar7 = b.IncorrectCan;
                        messengerInstance7.Send(new ProcessErrorMessage(str3, 8));
                    } else if (certificateType2 == CertificateType.PRESENCE) {
                        Messenger messengerInstance8 = Messenger.INSTANCE.Instance();
                        b bVar8 = b.IncorrectCan;
                        messengerInstance8.Send(new ProcessErrorMessage("Cannot initialize for the Presence certificate", 22));
                    } else if (this.f36906g.length() != 8) {
                        Messenger messengerInstance9 = Messenger.INSTANCE.Instance();
                        b bVar9 = b.IncorrectCan;
                        messengerInstance9.Send(new ProcessErrorMessage("Cannot initialize without properly set PUK", 3));
                    } else if (this.f36905f.length() == 4 || certificateType2 != CertificateType.AUTHENTICATION) {
                        if (this.f36905f.length() != 6 && certificateType2 == CertificateType.AUTHORIZATION) {
                            Messenger messengerInstance10 = Messenger.INSTANCE.Instance();
                            b bVar10 = b.IncorrectCan;
                            messengerInstance10.Send(new ProcessErrorMessage("Pin must consists of 6 digits for authorization certificate type.", 10));
                        }
                        requestType2 = RequestType.READ_ICAO;
                        if (requestType != requestType2) {
                            certificateType2 = null;
                        } else {
                            certificateType2 = null;
                        }
                        CertificateType certificateType4 = certificateType2;
                        String str4 = this.f36908i;
                        arrayList = new ArrayList();
                        if (requestType != RequestType.SIGN) {
                            requestType3 = RequestType.READ_ALL_DATA;
                            if (requestType != requestType3) {
                                arrayList.add("DG1");
                                arrayList.add("DG11");
                                arrayList.add("DG12");
                                arrayList.add("DG13");
                                arrayList.add("SOD");
                            } else {
                                arrayList.add("DG1");
                                arrayList.add("DG11");
                                arrayList.add("DG12");
                                arrayList.add("DG13");
                                arrayList.add("SOD");
                            }
                            if (requestType != requestType3) {
                                arrayList.add("DG2");
                            } else {
                                arrayList.add("DG2");
                            }
                        }
                        this.f36912m = new RequestDetailsDto(new RequestDetailsFields(arrayList), requestType, str4, certificateType4, v.n());
                        this.f36909j = true;
                        d1Var2.f14609f = 1;
                        if (a(600) == objE) {
                            return objE;
                        }
                    } else {
                        Messenger messengerInstance11 = Messenger.INSTANCE.Instance();
                        b bVar11 = b.IncorrectCan;
                        messengerInstance11.Send(new ProcessErrorMessage("New pin must consists of 4 digits for authentication certificate type.", 9));
                    }
                    return i0.f148189a;
                case 3:
                    if (certificateType2 == null) {
                        Messenger messengerInstance12 = Messenger.INSTANCE.Instance();
                        String str5 = "Declared operation type: " + requestType.name() + " needs setting type of certificate";
                        b bVar12 = b.IncorrectCan;
                        messengerInstance12.Send(new ProcessErrorMessage(str5, 8));
                    } else if (this.f36908i.length() == 0) {
                        Messenger messengerInstance13 = Messenger.INSTANCE.Instance();
                        b bVar13 = b.IncorrectCan;
                        messengerInstance13.Send(new ProcessErrorMessage("Cannot initialize without data", 5));
                    } else if (this.f36904e.length() == 4 || certificateType2 != CertificateType.AUTHENTICATION) {
                        if (this.f36904e.length() != 6 && certificateType2 == CertificateType.AUTHORIZATION) {
                            Messenger messengerInstance14 = Messenger.INSTANCE.Instance();
                            b bVar14 = b.IncorrectCan;
                            messengerInstance14.Send(new ProcessErrorMessage("Pin must consists of 6 digits for authorization certificate type.", 10));
                        }
                        requestType2 = RequestType.READ_ICAO;
                        if (requestType != requestType2) {
                            certificateType2 = null;
                        } else {
                            certificateType2 = null;
                        }
                        CertificateType certificateType5 = certificateType2;
                        String str6 = this.f36908i;
                        arrayList = new ArrayList();
                        if (requestType != RequestType.SIGN) {
                            requestType3 = RequestType.READ_ALL_DATA;
                            if (requestType != requestType3) {
                                arrayList.add("DG1");
                                arrayList.add("DG11");
                                arrayList.add("DG12");
                                arrayList.add("DG13");
                                arrayList.add("SOD");
                            } else {
                                arrayList.add("DG1");
                                arrayList.add("DG11");
                                arrayList.add("DG12");
                                arrayList.add("DG13");
                                arrayList.add("SOD");
                            }
                            if (requestType != requestType3) {
                                arrayList.add("DG2");
                            } else {
                                arrayList.add("DG2");
                            }
                        }
                        this.f36912m = new RequestDetailsDto(new RequestDetailsFields(arrayList), requestType, str6, certificateType5, v.n());
                        this.f36909j = true;
                        d1Var2.f14609f = 1;
                        if (a(600) == objE) {
                            return objE;
                        }
                    } else {
                        Messenger messengerInstance15 = Messenger.INSTANCE.Instance();
                        b bVar15 = b.IncorrectCan;
                        messengerInstance15.Send(new ProcessErrorMessage("Pin must consists of 4 digits for authentication certificate type.", 9));
                    }
                    return i0.f148189a;
                case 4:
                case 5:
                    requestType2 = RequestType.READ_ICAO;
                    if (requestType != requestType2) {
                        certificateType2 = null;
                    } else {
                        certificateType2 = null;
                    }
                    CertificateType certificateType6 = certificateType2;
                    String str7 = this.f36908i;
                    arrayList = new ArrayList();
                    if (requestType != RequestType.SIGN) {
                        requestType3 = RequestType.READ_ALL_DATA;
                        if (requestType != requestType3) {
                            arrayList.add("DG1");
                            arrayList.add("DG11");
                            arrayList.add("DG12");
                            arrayList.add("DG13");
                            arrayList.add("SOD");
                        } else {
                            arrayList.add("DG1");
                            arrayList.add("DG11");
                            arrayList.add("DG12");
                            arrayList.add("DG13");
                            arrayList.add("SOD");
                        }
                        if (requestType != requestType3) {
                            arrayList.add("DG2");
                        } else {
                            arrayList.add("DG2");
                        }
                    }
                    this.f36912m = new RequestDetailsDto(new RequestDetailsFields(arrayList), requestType, str7, certificateType6, v.n());
                    this.f36909j = true;
                    d1Var2.f14609f = 1;
                    if (a(600) == objE) {
                        return objE;
                    }
                    break;
                case 6:
                    if (certificateType2 == null) {
                        Messenger messengerInstance16 = Messenger.INSTANCE.Instance();
                        String str8 = "Declared operation type: " + requestType.name() + " needs setting type of certificate";
                        b bVar16 = b.IncorrectCan;
                        messengerInstance16.Send(new ProcessErrorMessage(str8, 8));
                    } else if (this.f36904e.length() == 4 || certificateType2 != CertificateType.AUTHENTICATION) {
                        if (this.f36904e.length() != 6 && certificateType2 == CertificateType.AUTHORIZATION) {
                            Messenger messengerInstance17 = Messenger.INSTANCE.Instance();
                            b bVar17 = b.IncorrectCan;
                            messengerInstance17.Send(new ProcessErrorMessage("Pin must consists of 6 digits for authorization certificate type.", 10));
                        }
                        requestType2 = RequestType.READ_ICAO;
                        if (requestType != requestType2) {
                            certificateType2 = null;
                        } else {
                            certificateType2 = null;
                        }
                        CertificateType certificateType7 = certificateType2;
                        String str9 = this.f36908i;
                        arrayList = new ArrayList();
                        if (requestType != RequestType.SIGN) {
                            requestType3 = RequestType.READ_ALL_DATA;
                            if (requestType != requestType3) {
                                arrayList.add("DG1");
                                arrayList.add("DG11");
                                arrayList.add("DG12");
                                arrayList.add("DG13");
                                arrayList.add("SOD");
                            } else {
                                arrayList.add("DG1");
                                arrayList.add("DG11");
                                arrayList.add("DG12");
                                arrayList.add("DG13");
                                arrayList.add("SOD");
                            }
                            if (requestType != requestType3) {
                                arrayList.add("DG2");
                            } else {
                                arrayList.add("DG2");
                            }
                        }
                        this.f36912m = new RequestDetailsDto(new RequestDetailsFields(arrayList), requestType, str9, certificateType7, v.n());
                        this.f36909j = true;
                        d1Var2.f14609f = 1;
                        if (a(600) == objE) {
                            return objE;
                        }
                    } else {
                        Messenger messengerInstance18 = Messenger.INSTANCE.Instance();
                        b bVar18 = b.IncorrectCan;
                        messengerInstance18.Send(new ProcessErrorMessage("Pin must consists of 4 digits for authentication certificate type.", 9));
                    }
                    return i0.f148189a;
                case 7:
                    if (certificateType2 == null) {
                        Messenger messengerInstance19 = Messenger.INSTANCE.Instance();
                        String str10 = "Declared operation type: " + requestType.name() + " needs setting type of certificate";
                        b bVar19 = b.IncorrectCan;
                        messengerInstance19.Send(new ProcessErrorMessage(str10, 8));
                    } else if (this.f36904e.length() == 4 || certificateType2 != CertificateType.AUTHENTICATION) {
                        if (this.f36904e.length() != 6 && certificateType2 == CertificateType.AUTHORIZATION) {
                            Messenger messengerInstance20 = Messenger.INSTANCE.Instance();
                            b bVar20 = b.IncorrectCan;
                            messengerInstance20.Send(new ProcessErrorMessage("Pin must consists of 6 digits for authorization certificate type.", 10));
                        }
                        requestType2 = RequestType.READ_ICAO;
                        if (requestType != requestType2) {
                            certificateType2 = null;
                        } else {
                            certificateType2 = null;
                        }
                        CertificateType certificateType8 = certificateType2;
                        String str11 = this.f36908i;
                        arrayList = new ArrayList();
                        if (requestType != RequestType.SIGN) {
                            requestType3 = RequestType.READ_ALL_DATA;
                            if (requestType != requestType3) {
                                arrayList.add("DG1");
                                arrayList.add("DG11");
                                arrayList.add("DG12");
                                arrayList.add("DG13");
                                arrayList.add("SOD");
                            } else {
                                arrayList.add("DG1");
                                arrayList.add("DG11");
                                arrayList.add("DG12");
                                arrayList.add("DG13");
                                arrayList.add("SOD");
                            }
                            if (requestType != requestType3) {
                                arrayList.add("DG2");
                            } else {
                                arrayList.add("DG2");
                            }
                        }
                        this.f36912m = new RequestDetailsDto(new RequestDetailsFields(arrayList), requestType, str11, certificateType8, v.n());
                        this.f36909j = true;
                        d1Var2.f14609f = 1;
                        if (a(600) == objE) {
                            return objE;
                        }
                    } else {
                        Messenger messengerInstance21 = Messenger.INSTANCE.Instance();
                        b bVar21 = b.IncorrectCan;
                        messengerInstance21.Send(new ProcessErrorMessage("Pin must consists of 4 digits for authentication certificate type.", 9));
                    }
                    return i0.f148189a;
                default:
                    throw new p();
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
        }
        this.f36900a.startListening();
        Messenger messengerInstance22 = Messenger.INSTANCE.Instance();
        b bVar22 = b.IncorrectCan;
        messengerInstance22.Send(new ProcessStartedMessage("Process initiated", 100));
        return i0.f148189a;
    }

    public final void b() {
        this.f36900a.stopListening();
    }

    public final void cancel() {
        if (!this.f36909j) {
            Messenger messengerInstance = Messenger.INSTANCE.Instance();
            b bVar = b.IncorrectCan;
            messengerInstance.Send(new ProcessErrorMessage("No active session to cancel", 18));
        } else {
            a();
            this.f36900a.stopListening();
            Messenger messengerInstance2 = Messenger.INSTANCE.Instance();
            b bVar2 = b.IncorrectCan;
            messengerInstance2.Send(new ProcessInfoMessage("Session cancelled successfully", 106));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005f, code lost:
    
        if (a(r7, r8, r1) == r2) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object initProcess(com.pl.pwpw.mobile.edoapp.edoLibrary.api.RequestType r7, com.pl.pwpw.mobile.edoapp.edoLibrary.api.CertificateType r8, tq.e<? super oq.i0> r9) throws java.lang.Throwable {
        /*
            r6 = this;
            java.lang.String r0 = "Unexpected error: "
            boolean r1 = r9 instanceof p019auX.b1
            if (r1 == 0) goto L15
            r1 = r9
            auX.b1 r1 = (p019auX.b1) r1
            int r2 = r1.f14606h
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f14606h = r2
            goto L1a
        L15:
            auX.b1 r1 = new auX.b1
            r1.<init>(r6, r9)
        L1a:
            java.lang.Object r9 = r1.f14604f
            java.lang.Object r2 = uq.b.e()
            int r3 = r1.f14606h
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L42
            if (r3 == r5) goto L3a
            if (r3 != r4) goto L32
            oq.u.b(r9)     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L30
            goto L62
        L2e:
            r7 = move-exception
            goto L92
        L30:
            r7 = move-exception
            goto L68
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3a:
            com.pl.pwpw.mobile.edoapp.edoLibrary.api.CertificateType r8 = r1.f14603e
            com.pl.pwpw.mobile.edoapp.edoLibrary.api.RequestType r7 = r1.f14602d
            oq.u.b(r9)     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L30
            goto L54
        L42:
            oq.u.b(r9)
            su.h r9 = r6.f36915p     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L30
            r1.f14602d = r7     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L30
            r1.f14603e = r8     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L30
            r1.f14606h = r5     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L30
            java.lang.Object r9 = r9.c(r1)     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L30
            if (r9 != r2) goto L54
            goto L61
        L54:
            r9 = 0
            r1.f14602d = r9     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L30
            r1.f14603e = r9     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L30
            r1.f14606h = r4     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L30
            java.lang.Object r7 = r6.a(r7, r8, r1)     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L30
            if (r7 != r2) goto L62
        L61:
            return r2
        L62:
            su.h r7 = r6.f36915p
            r7.b()
            goto L8f
        L68:
            com.pl.pwpw.mobile.edoapp.edoLibrary.api.Messenger$Companion r8 = com.pl.pwpw.mobile.edoapp.edoLibrary.api.Messenger.INSTANCE     // Catch: java.lang.Throwable -> L2e
            com.pl.pwpw.mobile.edoapp.edoLibrary.api.Messenger r8 = r8.Instance()     // Catch: java.lang.Throwable -> L2e
            com.pl.pwpw.mobile.edoapp.edoLibrary.messages.ProcessErrorMessage r9 = new com.pl.pwpw.mobile.edoapp.edoLibrary.messages.ProcessErrorMessage     // Catch: java.lang.Throwable -> L2e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r7 = r7.getMessage()     // Catch: java.lang.Throwable -> L2e
            r1.append(r7)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r7 = r1.toString()     // Catch: java.lang.Throwable -> L2e
            dv.b r0 = dv.b.IncorrectCan     // Catch: java.lang.Throwable -> L2e
            r0 = 99
            r9.<init>(r7, r0)     // Catch: java.lang.Throwable -> L2e
            r8.Send(r9)     // Catch: java.lang.Throwable -> L2e
            su.h r7 = r6.f36915p
            r7.b()
        L8f:
            oq.i0 r7 = oq.i0.f148189a
            return r7
        L92:
            su.h r8 = r6.f36915p
            r8.b()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pl.pwpw.mobile.edoapp.edoLibrary.api.SmartAppService.initProcess(com.pl.pwpw.mobile.edoapp.edoLibrary.api.RequestType, com.pl.pwpw.mobile.edoapp.edoLibrary.api.CertificateType, tq.e):java.lang.Object");
    }

    public final void setCan(String can) {
        if (can.length() != 6) {
            Messenger messengerInstance = Messenger.INSTANCE.Instance();
            b bVar = b.IncorrectCan;
            messengerInstance.Send(new ProcessErrorMessage("CAN length must consist 6 digits", 1));
        } else {
            if (!this.f36910k.f(can)) {
                Messenger messengerInstance2 = Messenger.INSTANCE.Instance();
                b bVar2 = b.IncorrectCan;
                messengerInstance2.Send(new ProcessErrorMessage("CAN must consists of digits only", 24));
                return;
            }
            this.f36907h = can;
            int i15 = this.f36903d;
            b bVar3 = b.IncorrectCan;
            if (i15 == 11) {
                this.f36900a.startListening();
                this.f36903d = 0;
            }
            Messenger.INSTANCE.Instance().Send(new ProcessInfoMessage("CAN set", 101));
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public final void setDataToSign(String dataToSign) {
        String str;
        byte[] bArrA1;
        if (dataToSign.length() == 0) {
            Messenger messengerInstance = Messenger.INSTANCE.Instance();
            b bVar = b.IncorrectCan;
            messengerInstance.Send(new ProcessErrorMessage("Signed data cannot be empty", 7));
            return;
        }
        if (dataToSign.length() % 2 != 0) {
            bArrA1 = new byte[0];
            str = dataToSign;
        } else {
            str = dataToSign;
            try {
                List<String> listZ1 = r.z1(r.P(str, " ", "", false, 4, null), 2);
                ArrayList arrayList = new ArrayList(v.y(listZ1, 10));
                Iterator<T> it = listZ1.iterator();
                while (it.hasNext()) {
                    arrayList.add(Byte.valueOf((byte) Integer.parseInt((String) it.next(), fu.a.a(16))));
                }
                bArrA1 = v.a1(arrayList);
            } catch (Exception unused) {
                bArrA1 = new byte[0];
            }
        }
        if (bArrA1.length != 48) {
            Messenger messengerInstance2 = Messenger.INSTANCE.Instance();
            b bVar2 = b.IncorrectCan;
            messengerInstance2.Send(new ProcessErrorMessage("Data to sign should be hash sha384 in HEX string format", 25));
        } else {
            this.f36908i = str;
            Messenger messengerInstance3 = Messenger.INSTANCE.Instance();
            b bVar3 = b.IncorrectCan;
            messengerInstance3.Send(new ProcessInfoMessage("Data set", 104));
        }
    }

    public final void setNewPin(String pin) {
        if (pin.length() != 4 && pin.length() != 6) {
            Messenger messengerInstance = Messenger.INSTANCE.Instance();
            b bVar = b.IncorrectCan;
            messengerInstance.Send(new ProcessErrorMessage("PIN length must consist 4 or 6 digits", 2));
        } else {
            if (!this.f36910k.f(pin)) {
                Messenger messengerInstance2 = Messenger.INSTANCE.Instance();
                b bVar2 = b.IncorrectCan;
                messengerInstance2.Send(new ProcessErrorMessage("PIN must consists of digits only", 24));
                return;
            }
            this.f36905f = pin;
            int i15 = this.f36903d;
            b bVar3 = b.IncorrectCan;
            if (i15 == 13) {
                this.f36900a.startListening();
                this.f36903d = 0;
            }
            Messenger.INSTANCE.Instance().Send(new ProcessInfoMessage("New PIN set", 102));
        }
    }

    public final void setPin(String pin) {
        if (pin.length() != 4 && pin.length() != 6) {
            Messenger messengerInstance = Messenger.INSTANCE.Instance();
            b bVar = b.IncorrectCan;
            messengerInstance.Send(new ProcessErrorMessage("PIN length must consist 4 or 6 digits", 2));
        } else {
            if (!this.f36910k.f(pin)) {
                Messenger messengerInstance2 = Messenger.INSTANCE.Instance();
                b bVar2 = b.IncorrectCan;
                messengerInstance2.Send(new ProcessErrorMessage("PIN must consists of digits only", 24));
                return;
            }
            this.f36904e = pin;
            this.f36906g = "";
            int i15 = this.f36903d;
            b bVar3 = b.IncorrectCan;
            if (i15 == 13) {
                this.f36900a.startListening();
                this.f36903d = 0;
            }
            Messenger.INSTANCE.Instance().Send(new ProcessInfoMessage("PIN set", 102));
        }
    }

    public final void setPuk(String puk) {
        if (puk.length() != 8) {
            Messenger messengerInstance = Messenger.INSTANCE.Instance();
            b bVar = b.IncorrectCan;
            messengerInstance.Send(new ProcessErrorMessage("PUK length must be 8 digits", 3));
        } else {
            if (!this.f36910k.f(puk)) {
                Messenger messengerInstance2 = Messenger.INSTANCE.Instance();
                b bVar2 = b.IncorrectCan;
                messengerInstance2.Send(new ProcessErrorMessage("PUK must consists of digits only", 24));
                return;
            }
            this.f36906g = puk;
            this.f36904e = "";
            int i15 = this.f36903d;
            b bVar3 = b.IncorrectCan;
            if (i15 == 13) {
                this.f36900a.startListening();
                this.f36903d = 0;
            }
            Messenger.INSTANCE.Instance().Send(new ProcessInfoMessage("PUK set", 103));
        }
    }

    /* JADX WARN: Code duplicated, block: B:140:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:145:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:49:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:50:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e0 A[Catch: f -> 0x004f, all -> 0x0116, Exception -> 0x0119, a -> 0x011b, e -> 0x011d, i -> 0x011f, d -> 0x0123, c -> 0x0126, g -> 0x012f, TryCatch #3 {f -> 0x004f, blocks: (B:15:0x003d, B:60:0x0105, B:32:0x0061, B:51:0x00be, B:53:0x00e0, B:56:0x00e8, B:55:0x00e5, B:35:0x0067, B:47:0x009c, B:38:0x006d, B:44:0x0083, B:41:0x0075), top: B:149:0x0031, outer: #18 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00e5 A[Catch: f -> 0x004f, all -> 0x0116, Exception -> 0x0119, a -> 0x011b, e -> 0x011d, i -> 0x011f, d -> 0x0123, c -> 0x0126, g -> 0x012f, TryCatch #3 {f -> 0x004f, blocks: (B:15:0x003d, B:60:0x0105, B:32:0x0061, B:51:0x00be, B:53:0x00e0, B:56:0x00e8, B:55:0x00e5, B:35:0x0067, B:47:0x009c, B:38:0x006d, B:44:0x0083, B:41:0x0075), top: B:149:0x0031, outer: #18 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0104  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15, types: [int] */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r7v0, types: [int] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v13, types: [int] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // com.pl.pwpw.mobile.edoapp.edoLibrary.api.ITagDetected
    public Object tagDetected(e<? super i0> eVar) throws Throwable {
        e1 e1Var;
        ?? r15;
        ?? r16;
        ?? r17;
        ?? r18;
        ?? r19;
        int i15;
        SmartAppService smartAppService;
        RequestDetailsDto requestDetailsDto;
        String str;
        int i16;
        if (eVar instanceof e1) {
            e1Var = (e1) eVar;
            int i17 = e1Var.f14614h;
            if ((i17 & PKIFailureInfo.systemUnavail) != 0) {
                e1Var.f14614h = i17 - PKIFailureInfo.systemUnavail;
            } else {
                e1Var = new e1(this, eVar);
            }
        } else {
            e1Var = new e1(this, eVar);
        }
        Object objA = e1Var.f14612f;
        Object objE = uq.b.e();
        ?? r25 = e1Var.f14614h;
        ?? r110 = 1;
        try {
            try {
                try {
                    try {
                        if (r25 == 0) {
                            u.b(objA);
                            i15 = 0;
                            INfcService iNfcService = this.f36900a;
                            e1Var.f14610d = 0;
                            e1Var.f14614h = 1;
                            if (iNfcService.connect(e1Var) == objE) {
                            }
                            return objE;
                        }
                        if (r25 != 1) {
                            if (r25 == 2) {
                                int i18 = e1Var.f14610d;
                                u.b(objA);
                                i16 = i18;
                                this.f36901b.d((g) objA);
                                k kVar = new k(this.f36900a, this.f36902c);
                                String str2 = this.f36907h;
                                m mVar = this.f36913n;
                                e1Var.f14611e = this;
                                e1Var.f14610d = i16;
                                e1Var.f14614h = 3;
                                objA = kVar.a(str2, mVar, e1Var);
                                if (objA == objE) {
                                    smartAppService = this;
                                    r25 = i16;
                                    smartAppService.f36911l = (c) objA;
                                    this.f36901b.e(this.f36911l);
                                    RequestDetailsDto requestDetailsDto2 = this.f36912m;
                                    w0 w0Var = new w0(requestDetailsDto2.f36953d, requestDetailsDto2.getF36958i());
                                    requestDetailsDto = this.f36912m;
                                    if (requestDetailsDto.f36953d == RequestType.RESET_PIN) {
                                        str = this.f36906g;
                                    } else {
                                        str = this.f36904e;
                                    }
                                    p004CoN.d1 d1Var = new p004CoN.d1(requestDetailsDto, str, this.f36905f, this.f36902c, this.f36901b);
                                    e1Var.f14611e = null;
                                    e1Var.f14610d = r25;
                                    e1Var.f14614h = 4;
                                    objA = d1Var.b(w0Var, e1Var);
                                    if (objA != objE) {
                                        r16 = r25;
                                        a((w0) objA);
                                        if (r16 != 0) {
                                            b();
                                        }
                                        return i0.f148189a;
                                    }
                                }
                                return objE;
                            }
                            try {
                                if (r25 == 3) {
                                    int i19 = e1Var.f14610d;
                                    smartAppService = e1Var.f14611e;
                                    u.b(objA);
                                    r25 = i19;
                                    smartAppService.f36911l = (c) objA;
                                    this.f36901b.e(this.f36911l);
                                    RequestDetailsDto requestDetailsDto3 = this.f36912m;
                                    w0 w0Var2 = new w0(requestDetailsDto3.f36953d, requestDetailsDto3.getF36958i());
                                    requestDetailsDto = this.f36912m;
                                    if (requestDetailsDto.f36953d == RequestType.RESET_PIN) {
                                        str = this.f36906g;
                                    } else {
                                        str = this.f36904e;
                                    }
                                    p004CoN.d1 d1Var2 = new p004CoN.d1(requestDetailsDto, str, this.f36905f, this.f36902c, this.f36901b);
                                    e1Var.f14611e = null;
                                    e1Var.f14610d = r25;
                                    e1Var.f14614h = 4;
                                    objA = d1Var2.b(w0Var2, e1Var);
                                    if (objA != objE) {
                                        r16 = r25;
                                        a((w0) objA);
                                        if (r16 != 0) {
                                            b();
                                        }
                                        return i0.f148189a;
                                    }
                                    return objE;
                                }
                                if (r25 != 4) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                r16 = e1Var.f14610d;
                                try {
                                    u.b(objA);
                                    r16 = r16;
                                    a((w0) objA);
                                    if (r16 != 0) {
                                        b();
                                    }
                                } catch (gc.a e15) {
                                    e = e15;
                                    gc.b bVar = e.f71743a;
                                    if (bVar == gc.b.CertificateNotActivated) {
                                        a(this, "Certificate inactive", b.CertificateInactive.b());
                                    } else if (bVar == gc.b.CertificateMissing) {
                                        a(this, "Certificate missing", b.CertificateMissing.b());
                                    }
                                    a();
                                } catch (gc.c unused) {
                                    a(this, "Data missing", b.DataMissing.b());
                                    a();
                                } catch (d unused2) {
                                    r18 = r16;
                                    a(this, "Document not supported", b.DocumentNotSupported.b());
                                    if (r18 != 0) {
                                        b();
                                    }
                                } catch (gc.e e16) {
                                    e = e16;
                                    r17 = r16;
                                    a(this, "Interrupted " + e.getMessage(), b.Interrupted.b());
                                    if (r17 != 0) {
                                        b();
                                    }
                                } catch (gc.g unused3) {
                                    a(this, "PIN blocked", b.PinBlocked.b());
                                    a();
                                } catch (gc.i e17) {
                                    e = e17;
                                    if (e.a() == gc.h.PaceIncorrectSecret) {
                                        b bVar2 = b.IncorrectCan;
                                        this.f36903d = bVar2.b();
                                        a(this, "Incorrect CAN", bVar2.b());
                                        r19 = 1;
                                    } else {
                                        a(this, "Interrupted", b.Interrupted.b());
                                        r19 = r16;
                                    }
                                    if (r19 != 0) {
                                        b();
                                    }
                                } catch (Exception e18) {
                                    e = e18;
                                    r15 = r16;
                                    if (t.c(e.getMessage(), "Tag was lost.") || t.c(e.getMessage(), "100") || t.c(e.getMessage(), "102") || t.c(e.getMessage(), "103") || t.c(e.getMessage(), "104") || t.c(e.getMessage(), "200") || t.c(e.getMessage(), "201") || t.c(e.getMessage(), "202")) {
                                        a(this, "Interrupted", b.Interrupted.b());
                                    } else {
                                        a(this, "Unexpected error: " + e.getMessage(), b.UnexpectedError.b());
                                    }
                                    if (r15 != 0) {
                                        b();
                                    }
                                }
                                return i0.f148189a;
                            } catch (Throwable th4) {
                                th = th4;
                                r25 = r110;
                                if (r25 != 0) {
                                    b();
                                }
                                throw th;
                            }
                        }
                        int i25 = e1Var.f14610d;
                        u.b(objA);
                        i15 = i25;
                        this.f36911l = null;
                        this.f36901b.b();
                        this.f36901b.c(this.f36900a);
                        e1Var.f14610d = i15;
                        e1Var.f14614h = 2;
                        objA = a(e1Var);
                        i16 = i15;
                        if (objA != objE) {
                            this.f36901b.d((g) objA);
                            k kVar2 = new k(this.f36900a, this.f36902c);
                            String str3 = this.f36907h;
                            m mVar2 = this.f36913n;
                            e1Var.f14611e = this;
                            e1Var.f14610d = i16;
                            e1Var.f14614h = 3;
                            objA = kVar2.a(str3, mVar2, e1Var);
                            if (objA == objE) {
                                smartAppService = this;
                                r25 = i16;
                                smartAppService.f36911l = (c) objA;
                                this.f36901b.e(this.f36911l);
                                RequestDetailsDto requestDetailsDto4 = this.f36912m;
                                w0 w0Var3 = new w0(requestDetailsDto4.f36953d, requestDetailsDto4.getF36958i());
                                requestDetailsDto = this.f36912m;
                                if (requestDetailsDto.f36953d == RequestType.RESET_PIN) {
                                    str = this.f36906g;
                                } else {
                                    str = this.f36904e;
                                }
                                p004CoN.d1 d1Var3 = new p004CoN.d1(requestDetailsDto, str, this.f36905f, this.f36902c, this.f36901b);
                                e1Var.f14611e = null;
                                e1Var.f14610d = r25;
                                e1Var.f14614h = 4;
                                objA = d1Var3.b(w0Var3, e1Var);
                                if (objA != objE) {
                                    r16 = r25;
                                    a((w0) objA);
                                    if (r16 != 0) {
                                        b();
                                    }
                                    return i0.f148189a;
                                }
                            }
                        }
                        return objE;
                    } catch (Throwable th5) {
                        th = th5;
                        r110 = e1Var;
                    }
                } catch (f e19) {
                    b bVar3 = b.IncorrectPin;
                    this.f36903d = bVar3.b();
                    String str4 = "Incorrect PIN, " + e19.f71747a + " tries left";
                    int iB = bVar3.b();
                    Integer num = e19.f71747a;
                    if (this.f36909j) {
                        if (num != null) {
                            Messenger.INSTANCE.Instance().Send(new IncorrectPinErrorMessage(str4, iB, num.intValue()));
                        } else {
                            Messenger.INSTANCE.Instance().Send(new ProcessErrorMessage(str4, iB));
                        }
                    }
                }
            } catch (Throwable th6) {
                th = th6;
                r110 = 1;
            }
        } catch (gc.a e25) {
            e = e25;
        } catch (gc.c unused4) {
        } catch (d unused5) {
            r18 = r25;
        } catch (gc.e e26) {
            e = e26;
            r17 = r25;
        } catch (gc.g unused6) {
        } catch (gc.i e27) {
            e = e27;
            r16 = r25;
        } catch (Exception e28) {
            e = e28;
            r15 = r25;
        } catch (Throwable th7) {
            th = th7;
            if (r25 != 0) {
                b();
            }
            throw th;
        }
    }

    public final void a(w0 w0Var) {
        byte[] bArr;
        int i15;
        int i16;
        int i17;
        int i18;
        Messenger messengerInstance = Messenger.INSTANCE.Instance();
        RequestType requestType = w0Var.f5121a;
        ArrayList arrayList = new ArrayList();
        if (requestType != RequestType.SIGN) {
            RequestType requestType2 = RequestType.READ_ALL_DATA;
            if (requestType == requestType2 || requestType == RequestType.READ_ICAO) {
                arrayList.add("DG1");
                arrayList.add("DG11");
                arrayList.add("DG12");
                arrayList.add("DG13");
                arrayList.add("SOD");
            }
            if (requestType == requestType2 || requestType == RequestType.READ_PHOTO) {
                arrayList.add("DG2");
            }
        }
        IcaoDto icaoDto = new IcaoDto();
        CertificateType certificateType = w0Var.f5122b;
        boolean z15 = false;
        if (certificateType == null) {
            bArr = new byte[0];
        } else {
            int i19 = j1.f260a[certificateType.ordinal()];
            if (i19 == 1) {
                bArr = w0Var.f5130j.f90868e;
            } else if (i19 != 2) {
                bArr = w0Var.f5131k.f90874e;
            } else {
                bArr = w0Var.f5129i.f90899b;
            }
        }
        CertificateType certificateType2 = w0Var.f5122b;
        if (certificateType2 != null) {
            int i25 = j1.f260a[certificateType2.ordinal()];
            if (i25 == 1) {
                i15 = w0Var.f5130j.f90864a;
            } else if (i25 == 2) {
                w0Var.f5129i.getClass();
                i16 = -1;
            } else if (i25 == 3) {
                i15 = w0Var.f5131k.f90870a;
            } else {
                throw new p();
            }
            i16 = i15;
        } else {
            i16 = -1;
        }
        CertificateType certificateType3 = w0Var.f5122b;
        if (certificateType3 != null) {
            int i26 = j1.f260a[certificateType3.ordinal()];
            if (i26 == 1) {
                i17 = w0Var.f5130j.f90865b;
            } else if (i26 == 2) {
                w0Var.f5129i.getClass();
                i18 = -1;
            } else if (i26 == 3) {
                i17 = w0Var.f5131k.f90871b;
            } else {
                throw new p();
            }
            i18 = i17;
        } else {
            i18 = -1;
        }
        CertificateType certificateType4 = w0Var.f5122b;
        if (certificateType4 != null) {
            int i27 = j1.f260a[certificateType4.ordinal()];
            if (i27 == 1) {
                z15 = w0Var.f5130j.f90866c;
            } else if (i27 == 2) {
                w0Var.f5129i.getClass();
            } else if (i27 == 3) {
                z15 = w0Var.f5131k.f90872c;
            } else {
                throw new p();
            }
        }
        boolean z16 = z15;
        ic.h hVar = w0Var.f5123c;
        byte[] bArr2 = hVar != null ? hVar.f90883b : null;
        if (arrayList.contains("DG1") && bArr2 != null) {
            icaoDto.f36943a = r.A(g1.f259b.a(bArr2));
        }
        ic.i iVar = w0Var.f5124d;
        byte[] bArr3 = iVar != null ? iVar.f90885b : null;
        if (arrayList.contains("DG2") && bArr3 != null) {
            icaoDto.f36944b = r.A(g1.f259b.a(bArr3));
        }
        ic.e eVar = w0Var.f5125e;
        byte[] bArr4 = eVar != null ? eVar.f90877b : null;
        if (arrayList.contains("DG11") && bArr4 != null) {
            icaoDto.f36945c = r.A(g1.f259b.a(bArr4));
        }
        ic.f fVar = w0Var.f5126f;
        byte[] bArr5 = fVar != null ? fVar.f90879b : null;
        if (arrayList.contains("DG12") && bArr5 != null) {
            icaoDto.f36946d = r.A(g1.f259b.a(bArr5));
        }
        ic.g gVar = w0Var.f5127g;
        byte[] bArr6 = gVar != null ? gVar.f90881b : null;
        if (arrayList.contains("DG13") && bArr6 != null) {
            icaoDto.f36947e = r.A(g1.f259b.a(bArr6));
        }
        ic.o oVar = w0Var.f5128h;
        byte[] bArr7 = oVar != null ? oVar.f90897b : null;
        if (arrayList.contains("SOD") && bArr7 != null) {
            icaoDto.f36948f = r.A(g1.f259b.a(bArr7));
        }
        b bVar = b.IncorrectCan;
        messengerInstance.Send(new ProcessFinishedMessage("Process finished successfully", 300, r.A(g1.f259b.a(bArr)), icaoDto.f36943a, icaoDto.f36944b, icaoDto.f36945c, icaoDto.f36946d, icaoDto.f36947e, icaoDto.f36948f, w0Var.f5132l, i16, i18, z16));
        this.f36900a.stopListening();
        a();
    }

    public final void a() {
        this.f36912m = null;
        this.f36907h = "";
        this.f36908i = "";
        this.f36904e = "";
        this.f36905f = "";
        this.f36906g = "";
        this.f36903d = 0;
        this.f36909j = false;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0113  */
    /* JADX WARN: Code duplicated, block: B:60:0x011f A[Catch: Exception -> 0x0049, TRY_LEAVE, TryCatch #0 {Exception -> 0x0049, blocks: (B:15:0x0044, B:58:0x0118, B:60:0x011f, B:54:0x00ec), top: B:119:0x0037 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0133  */
    /* JADX WARN: Code duplicated, block: B:63:0x0136  */
    /* JADX WARN: Code duplicated, block: B:70:0x015b  */
    /* JADX WARN: Code duplicated, block: B:71:0x015e  */
    /* JADX WARN: Code duplicated, block: B:78:0x0182  */
    /* JADX WARN: Code duplicated, block: B:79:0x0185  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:86:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:87:0x01aa  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007f, code lost:
    
        if (r14.transreceive(r0, r2) == r3) goto L56;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v16, types: [hc.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(tq.e r19) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pl.pwpw.mobile.edoapp.edoLibrary.api.SmartAppService.a(tq.e):java.lang.Object");
    }

    public static void a(SmartAppService smartAppService, String str, int i15) {
        if (smartAppService.f36909j) {
            Messenger.INSTANCE.Instance().Send(new ProcessErrorMessage(str, i15));
        }
    }

    public final i0 a(int i15) {
        d2 d2Var;
        AUX.c cVar = this.f36914o;
        if (cVar != null && (d2Var = cVar.f6b) != null) {
            d2.a.a(d2Var, null, 1, null);
        }
        AUX.c cVar2 = new AUX.c();
        this.f36914o = cVar2;
        cVar2.f6b = ju.k.d(cVar2.f5a, ju.g1.b(), null, new AUX.b(i15 * 1000, new c1(this), null), 2, null);
        i0 i0Var = i0.f148189a;
        uq.b.e();
        return i0Var;
    }
}
