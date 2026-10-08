package jc4;

import android.nfc.NfcAdapter;
import android.nfc.Tag;
import android.nfc.tech.IsoDep;
import android.os.Bundle;
import com.pl.pwpw.mobile.edoapp.edoLibrary.api.CertificateType;
import com.pl.pwpw.mobile.edoapp.edoLibrary.api.INfcService;
import com.pl.pwpw.mobile.edoapp.edoLibrary.api.ITagDetected;
import com.pl.pwpw.mobile.edoapp.edoLibrary.api.Messenger;
import com.pl.pwpw.mobile.edoapp.edoLibrary.api.RequestType;
import com.pl.pwpw.mobile.edoapp.edoLibrary.api.SmartAppService;
import com.pl.pwpw.mobile.edoapp.edoLibrary.messages.IncorrectPinErrorMessage;
import com.pl.pwpw.mobile.edoapp.edoLibrary.messages.ProcessErrorMessage;
import com.pl.pwpw.mobile.edoapp.edoLibrary.messages.ProcessFinishedMessage;
import com.pl.pwpw.mobile.edoapp.edoLibrary.messages.ProcessInfoMessage;
import com.pl.pwpw.mobile.edoapp.edoLibrary.messages.ProcessProgressMessage;
import com.pl.pwpw.mobile.edoapp.edoLibrary.messages.ProcessStartedMessage;
import er.l;
import er.p;
import fr.q0;
import java.io.IOException;
import ju.p0;
import oq.i0;
import oq.t;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import vq.j;
import vq.k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \r2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\"B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0017\u0010\u0010J\u000f\u0010\u0018\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0018\u0010\u0010J\u000f\u0010\u0019\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0019\u0010\u0010J\u0018\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aH\u0096@¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010 \u001a\u00020\f2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b \u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010*\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010)R\u0018\u0010-\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u00101\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00104\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00108\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010<\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006="}, d2 = {"Ljc4/g;", "Ls00/b;", "Lcom/pl/pwpw/mobile/edoapp/edoLibrary/api/INfcService;", "Landroid/nfc/NfcAdapter$ReaderCallback;", "Lpx/b;", "logger", "<init>", "(Lpx/b;)V", "Ls00/d;", "readerConnector", "Lcy/b$a;", "preset", "Loq/i0;", "i", "(Ls00/d;Lcy/b$a;Ltq/e;)Ljava/lang/Object;", "c", "()V", "Lcom/pl/pwpw/mobile/edoapp/edoLibrary/api/ITagDetected;", "listener", "addListener", "(Lcom/pl/pwpw/mobile/edoapp/edoLibrary/api/ITagDetected;)V", "connect", "(Ltq/e;)Ljava/lang/Object;", "disconnect", "startListening", "stopListening", "", "request", "transreceive", "([BLtq/e;)Ljava/lang/Object;", "Landroid/nfc/Tag;", "tag", "onTagDiscovered", "(Landroid/nfc/Tag;)V", "a", "Lpx/b;", "Lcom/pl/pwpw/mobile/edoapp/edoLibrary/api/Messenger;", "b", "Lcom/pl/pwpw/mobile/edoapp/edoLibrary/api/Messenger;", "messenger", "Lcom/pl/pwpw/mobile/edoapp/edoLibrary/api/SmartAppService;", "Lcom/pl/pwpw/mobile/edoapp/edoLibrary/api/SmartAppService;", "smartAppService", "d", "Ls00/d;", "nfcManagerReaderConnector", "Landroid/nfc/tech/IsoDep;", "e", "Landroid/nfc/tech/IsoDep;", "tagInterface", "f", "Lcom/pl/pwpw/mobile/edoapp/edoLibrary/api/ITagDetected;", "tagListener", "Landroid/os/Bundle;", "g", "Landroid/os/Bundle;", "bundle", "", "h", "I", "flags", "edo_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g implements s00.b, INfcService, NfcAdapter.ReaderCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final px.b logger;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Messenger messenger = Messenger.INSTANCE.Instance();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final SmartAppService smartAppService = new SmartAppService(this);

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private s00.d nfcManagerReaderConnector;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private IsoDep tagInterface;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private ITagDetected tagListener;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private Bundle bundle;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int flags;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f101634a;

        static {
            int[] iArr = new int[cy.b.a.c.values().length];
            try {
                iArr[cy.b.a.c.PRESENCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[cy.b.a.c.AUTHENTICATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[cy.b.a.c.AUTHORIZATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f101634a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f101635d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f101636e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f101637f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f101638g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f101639h;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f101641k;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f101639h = obj;
            this.f101641k |= PKIFailureInfo.systemUnavail;
            return g.this.a(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends k implements p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f101642e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ ITagDetected f101643f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(ITagDetected iTagDetected, tq.e<? super d> eVar) {
            super(2, eVar);
            this.f101643f = iTagDetected;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f101642e;
            if (i15 == 0) {
                u.b(obj);
                ITagDetected iTagDetected = this.f101643f;
                this.f101642e = 1;
                if (iTagDetected.tagDetected(this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((d) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new d(this.f101643f, eVar);
        }
    }

    public g(px.b bVar) {
        this.logger = bVar;
        Bundle bundle = new Bundle();
        bundle.putInt("presence", 5000);
        this.bundle = bundle;
        this.flags = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(s00.d dVar, ProcessErrorMessage processErrorMessage) {
        dVar.f(new cy.c.Error(processErrorMessage.getContent(), processErrorMessage.getCode()));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(s00.d dVar, IncorrectPinErrorMessage incorrectPinErrorMessage) {
        dVar.f(new cy.c.InvalidPinOrPukError(incorrectPinErrorMessage.getContent(), incorrectPinErrorMessage.getCode(), incorrectPinErrorMessage.getTriesLeft()));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(s00.d dVar, ProcessFinishedMessage processFinishedMessage) {
        dVar.f(new cy.c.Finished(processFinishedMessage.getContent(), processFinishedMessage.getCode(), processFinishedMessage.getCertificate(), processFinishedMessage.getDG1(), processFinishedMessage.getDG11(), processFinishedMessage.getDG12(), processFinishedMessage.getDG13(), processFinishedMessage.getDG2(), processFinishedMessage.getSOD(), processFinishedMessage.getSignedData(), processFinishedMessage.getCertificatePinCounter(), processFinishedMessage.getCertificatePukCounter(), processFinishedMessage.getCertificateIsActivated()));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(s00.d dVar, ProcessInfoMessage processInfoMessage) {
        dVar.f(new cy.c.Info(processInfoMessage.getContent(), processInfoMessage.getCode()));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(s00.d dVar, ProcessProgressMessage processProgressMessage) {
        dVar.f(new cy.c.Progress(processProgressMessage.getContent(), processProgressMessage.getCode(), processProgressMessage.getProgress()));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(s00.d dVar, ProcessStartedMessage processStartedMessage) {
        dVar.f(new cy.c.Started(processStartedMessage.getContent(), processStartedMessage.getCode()));
        return i0.f148189a;
    }

    @Override // com.pl.pwpw.mobile.edoapp.edoLibrary.api.INfcService
    public void addListener(ITagDetected listener) {
        this.logger.n7("addListener", px.c.a(this));
        this.tagListener = listener;
    }

    @Override // s00.e
    public void c() {
        this.logger.n7("disable", px.c.a(this));
        this.smartAppService.cancel();
        this.messenger.UnregisterAll();
        this.nfcManagerReaderConnector = null;
    }

    @Override // com.pl.pwpw.mobile.edoapp.edoLibrary.api.INfcService
    public Object connect(tq.e<? super i0> eVar) throws IOException {
        this.logger.n7("connect, tagInterface: " + this.tagInterface, px.c.a(this));
        IsoDep isoDep = this.tagInterface;
        if (isoDep != null) {
            isoDep.setTimeout(60000);
            isoDep.connect();
        }
        return i0.f148189a;
    }

    @Override // com.pl.pwpw.mobile.edoapp.edoLibrary.api.INfcService
    public void disconnect() throws IOException {
        this.logger.n7("disconnect", px.c.a(this));
        IsoDep isoDep = this.tagInterface;
        if (isoDep != null) {
            isoDep.close();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // s00.e
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Object a(final s00.d dVar, cy.b.a aVar, tq.e<? super i0> eVar) throws Throwable {
        c cVar;
        RequestType requestType;
        CertificateType certificateType;
        Object objB;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f101641k;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f101641k = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object obj = cVar.f101639h;
        Object objE = uq.b.e();
        int i16 = cVar.f101641k;
        if (i16 == 0) {
            u.b(obj);
            this.logger.n7("enable", px.c.a(this));
            this.nfcManagerReaderConnector = dVar;
            String str = null;
            this.tagInterface = null;
            this.messenger.UnregisterAll();
            this.messenger.Register(q0.c(ProcessErrorMessage.class), new l() { // from class: jc4.a
                @Override // er.l
                public final Object b(Object obj2) {
                    return g.j(dVar, (ProcessErrorMessage) obj2);
                }
            });
            this.messenger.Register(q0.c(IncorrectPinErrorMessage.class), new l() { // from class: jc4.b
                @Override // er.l
                public final Object b(Object obj2) {
                    return g.k(dVar, (IncorrectPinErrorMessage) obj2);
                }
            });
            this.messenger.Register(q0.c(ProcessFinishedMessage.class), new l() { // from class: jc4.c
                @Override // er.l
                public final Object b(Object obj2) {
                    return g.l(dVar, (ProcessFinishedMessage) obj2);
                }
            });
            this.messenger.Register(q0.c(ProcessInfoMessage.class), new l() { // from class: jc4.d
                @Override // er.l
                public final Object b(Object obj2) {
                    return g.m(dVar, (ProcessInfoMessage) obj2);
                }
            });
            this.messenger.Register(q0.c(ProcessProgressMessage.class), new l() { // from class: jc4.e
                @Override // er.l
                public final Object b(Object obj2) {
                    return g.n(dVar, (ProcessProgressMessage) obj2);
                }
            });
            this.messenger.Register(q0.c(ProcessStartedMessage.class), new l() { // from class: jc4.f
                @Override // er.l
                public final Object b(Object obj2) {
                    return g.o(dVar, (ProcessStartedMessage) obj2);
                }
            });
            if (aVar instanceof cy.b.a.AuthenticationSign) {
                cy.b.a.AuthenticationSign authenticationSign = (cy.b.a.AuthenticationSign) aVar;
                this.smartAppService.setDataToSign(authenticationSign.getDataToSign());
                this.smartAppService.setPin(authenticationSign.getPin());
                this.smartAppService.setCan(authenticationSign.getCan());
                requestType = RequestType.SIGN;
            } else if (aVar instanceof cy.b.a.AuthorizationSign) {
                cy.b.a.AuthorizationSign authorizationSign = (cy.b.a.AuthorizationSign) aVar;
                this.smartAppService.setDataToSign(authorizationSign.getDataToSign());
                this.smartAppService.setPin(authorizationSign.getPin());
                this.smartAppService.setCan(authorizationSign.getCan());
                requestType = RequestType.SIGN;
            } else if (aVar instanceof cy.b.a.PresenceSign) {
                cy.b.a.PresenceSign presenceSign = (cy.b.a.PresenceSign) aVar;
                this.smartAppService.setDataToSign(presenceSign.getDataToSign());
                this.smartAppService.setCan(presenceSign.getCan());
                requestType = RequestType.SIGN;
            } else if (aVar instanceof cy.b.a.ChangeAuthenticationPin) {
                cy.b.a.ChangeAuthenticationPin changeAuthenticationPin = (cy.b.a.ChangeAuthenticationPin) aVar;
                this.smartAppService.setPin(changeAuthenticationPin.getPin());
                this.smartAppService.setNewPin(changeAuthenticationPin.getNewPin());
                this.smartAppService.setCan(changeAuthenticationPin.getCan());
                requestType = RequestType.CHANGE_PIN;
            } else if (aVar instanceof cy.b.a.ChangeAuthorizationPin) {
                cy.b.a.ChangeAuthorizationPin changeAuthorizationPin = (cy.b.a.ChangeAuthorizationPin) aVar;
                this.smartAppService.setPin(changeAuthorizationPin.getPin());
                this.smartAppService.setNewPin(changeAuthorizationPin.getNewPin());
                this.smartAppService.setCan(changeAuthorizationPin.getCan());
                requestType = RequestType.CHANGE_PIN;
            } else if (aVar instanceof cy.b.a.ReadAllData) {
                this.smartAppService.setCan(((cy.b.a.ReadAllData) aVar).getCan());
                requestType = RequestType.READ_ALL_DATA;
            } else if (aVar instanceof cy.b.a.ReadCertificate) {
                cy.b.a.ReadCertificate readCertificate = (cy.b.a.ReadCertificate) aVar;
                this.smartAppService.setCan(readCertificate.getCan());
                int i17 = b.f101634a[readCertificate.getCertificateType().ordinal()];
                if (i17 != 1) {
                    if (i17 == 2) {
                        str = "0000";
                    } else {
                        if (i17 != 3) {
                            throw new oq.p();
                        }
                        str = "000000";
                    }
                }
                if (str != null) {
                    this.smartAppService.setPin(str);
                }
                requestType = RequestType.READ_CERTIFICATE;
            } else if (aVar instanceof cy.b.a.ReadICAO) {
                this.smartAppService.setCan(((cy.b.a.ReadICAO) aVar).getCan());
                requestType = RequestType.READ_ICAO;
            } else if (aVar instanceof cy.b.a.ReadPhoto) {
                this.smartAppService.setCan(((cy.b.a.ReadPhoto) aVar).getCan());
                requestType = RequestType.READ_PHOTO;
            } else if (aVar instanceof cy.b.a.ResetAuthenticationPin) {
                cy.b.a.ResetAuthenticationPin resetAuthenticationPin = (cy.b.a.ResetAuthenticationPin) aVar;
                this.smartAppService.setNewPin(resetAuthenticationPin.getNewPin());
                this.smartAppService.setPuk(resetAuthenticationPin.getPuk());
                this.smartAppService.setCan(resetAuthenticationPin.getCan());
                requestType = RequestType.RESET_PIN;
            } else {
                if (!(aVar instanceof cy.b.a.ResetAuthorizationPin)) {
                    throw new oq.p();
                }
                cy.b.a.ResetAuthorizationPin resetAuthorizationPin = (cy.b.a.ResetAuthorizationPin) aVar;
                this.smartAppService.setNewPin(resetAuthorizationPin.getNewPin());
                this.smartAppService.setPuk(resetAuthorizationPin.getPuk());
                this.smartAppService.setCan(resetAuthorizationPin.getCan());
                requestType = RequestType.RESET_PIN;
            }
            int i18 = b.f101634a[aVar.getCertificateType().ordinal()];
            if (i18 == 1) {
                certificateType = CertificateType.PRESENCE;
            } else if (i18 == 2) {
                certificateType = CertificateType.AUTHENTICATION;
            } else {
                if (i18 != 3) {
                    throw new oq.p();
                }
                certificateType = CertificateType.AUTHORIZATION;
            }
            this.flags = aVar.getPlatformSoundEnabled() ? 3 : 259;
            SmartAppService smartAppService = this.smartAppService;
            cVar.f101635d = j.a(dVar);
            cVar.f101636e = aVar;
            cVar.f101637f = j.a(requestType);
            cVar.f101638g = j.a(certificateType);
            cVar.f101641k = 1;
            if (smartAppService.initProcess(requestType, certificateType, cVar) == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (cy.b.a) cVar.f101636e;
            u.b(obj);
        }
        s00.d dVar2 = this.nfcManagerReaderConnector;
        if (dVar2 != null) {
            try {
                t.Companion companion = t.INSTANCE;
                dVar2.a();
                objB = t.b(i0.f148189a);
            } catch (Throwable th4) {
                t.Companion companion2 = t.INSTANCE;
                objB = t.b(u.a(th4));
            }
            Throwable thD = t.d(objB);
            if (thD != null) {
                this.logger.n7("stopReading before restart failed: " + thD, px.c.a(this));
            }
            dVar2.d(this, this.bundle, this.flags);
        }
        this.logger.n7("smartAppService: " + this.smartAppService, px.c.a(this));
        this.logger.n7("initialized preset: " + aVar, px.c.a(this));
        return i0.f148189a;
    }

    @Override // android.nfc.NfcAdapter.ReaderCallback
    public void onTagDiscovered(Tag tag) {
        this.logger.n7("onTagDiscovered, tag: " + tag, px.c.a(this));
        this.tagInterface = IsoDep.get(tag);
        s00.d dVar = this.nfcManagerReaderConnector;
        if (dVar != null) {
            dVar.f(new cy.c.Info("Tag discovered", 10000));
        }
        ITagDetected iTagDetected = this.tagListener;
        if (iTagDetected != null) {
            ju.j.b(null, new d(iTagDetected, null), 1, null);
        }
    }

    @Override // com.pl.pwpw.mobile.edoapp.edoLibrary.api.INfcService
    public void startListening() {
        this.logger.n7("startListening", px.c.a(this));
        s00.d dVar = this.nfcManagerReaderConnector;
        if (dVar != null) {
            dVar.d(this, this.bundle, this.flags);
        }
    }

    @Override // com.pl.pwpw.mobile.edoapp.edoLibrary.api.INfcService
    public void stopListening() {
        this.logger.n7("stopListening", px.c.a(this));
        this.messenger.UnregisterAll();
        s00.d dVar = this.nfcManagerReaderConnector;
        if (dVar != null) {
            dVar.a();
        }
    }

    @Override // com.pl.pwpw.mobile.edoapp.edoLibrary.api.INfcService
    public Object transreceive(byte[] bArr, tq.e<? super byte[]> eVar) throws IOException {
        IsoDep isoDep = this.tagInterface;
        byte[] bArrTransceive = null;
        if (isoDep != null) {
            this.logger.n7("transreceive, is connected: " + isoDep.isConnected(), px.c.a(this));
            if (isoDep.isConnected()) {
                bArrTransceive = isoDep.transceive(bArr);
            }
        }
        return bArrTransceive == null ? new byte[0] : bArrTransceive;
    }
}
