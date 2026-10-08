package h21;

import java.util.regex.Pattern;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\t\"\u001c\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003\"\u001c\u0010\u0006\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0003\"\u001c\u0010\b\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0003¨\u0006\t"}, d2 = {"Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "a", "Ljava/util/regex/Pattern;", "EMAIL_ADDRESS_PATTERN", "b", "DIGITS_PATTERN", "c", "PHONE_NUMBER_PATTERN", "chatbot_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f80053a = Pattern.compile("[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", 2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f80054b = Pattern.compile("\\b\\S*(?:\\d\\S*){5,}\\S*\\b", 2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f80055c = Pattern.compile("\\b\\d{2,3}\\s\\d{3}\\s\\d{2,3}\\b", 2);
}
