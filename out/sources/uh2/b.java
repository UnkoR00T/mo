package uh2;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0016\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0018"}, d2 = {"Luh2/b;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "a", "I", "getValue", "()I", "b", "c", "d", "e", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "legacy_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public enum b {
    DEVICE_GET_ID(107),
    JSON_PARSE(109),
    CRYPTO_ENCRYPT_CONTAINER(213),
    CRYPTO_DECRYPT_CONTAINER(214),
    CRYPTO_SECKEY_GEN_FAILED(222),
    CONTAINER_NOT_FOUND(304),
    CONTAINER_CACHE_ALL_TIMEOUT(310),
    CONTAINER_COMPRESSION(311),
    CONTAINER_DECOMPRESSION(312),
    SERVER_PARSE_USER_DATA(704),
    SCHOOL_CARD_PASSWORD_WRONG(1000),
    XORED_ANDROID_ID_WRONG_LENGTH(1006),
    IMEI_IS_NULL(1007),
    SCHOOL_ACTIVATION_DIFFERENT_REFRESHED_PESEL(1013);


    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final /* synthetic */ wq.a f198490s = wq.b.a(b());

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int value;

    b(int i15) {
        this.value = i15;
    }
}
