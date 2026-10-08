package com.pl.pwpw.mobile.edoapp.edoLibrary.api;

import p071kotlin.Metadata;
import wq.a;
import wq.b;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.pl.pwpw.mobile.edoapp.edoLibrary.api.RequestType[], still in use, count: 1, list:
  (r0v1 com.pl.pwpw.mobile.edoapp.edoLibrary.api.RequestType[]) from 0x004c: INVOKE (r0v1 com.pl.pwpw.mobile.edoapp.edoLibrary.api.RequestType[]) STATIC call: wq.b.a(java.lang.Enum[]):wq.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):wq.a<E extends java.lang.Enum<E>> (m), WRAPPED]
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/pl/pwpw/mobile/edoapp/edoLibrary/api/RequestType;", "", "SIGN", "READ_ALL_DATA", "READ_ICAO", "READ_PHOTO", "READ_CERTIFICATE", "CHANGE_PIN", "RESET_PIN", "edoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RequestType {
    SIGN,
    READ_ALL_DATA,
    READ_ICAO,
    READ_PHOTO,
    READ_CERTIFICATE,
    CHANGE_PIN,
    RESET_PIN;


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a f36899b;

    static {
        f36899b = b.a(requestTypeArr);
    }

    public RequestType() {
        super(str, i);
    }

    public static a<RequestType> getEntries() {
        return f36899b;
    }

    public static RequestType valueOf(String str) {
        return (RequestType) Enum.valueOf(RequestType.class, str);
    }

    public static RequestType[] values() {
        return (RequestType[]) f36898a.clone();
    }
}
