package mz;

import android.net.Uri;
import android.os.Bundle;
import android.provider.CalendarContract;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002BC\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\n\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0016R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0016¨\u0006\u001f"}, d2 = {"Lmz/a;", "Lmz/d;", "Lmz/b;", "", "eventTitle", "", "eventStartTimeMillis", "eventEndTimeMillis", "", "eventAllDay", "eventDescription", "eventLocation", "<init>", "(Ljava/lang/String;JLjava/lang/Long;ZLjava/lang/String;Ljava/lang/String;)V", "a", "()Ljava/lang/String;", "Landroid/net/Uri;", "getData", "()Landroid/net/Uri;", "Landroid/os/Bundle;", "getExtras", "()Landroid/os/Bundle;", "Ljava/lang/String;", "b", "J", "c", "Ljava/lang/Long;", "d", "Z", "e", "f", "intent_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements d, b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String eventTitle;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long eventStartTimeMillis;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Long eventEndTimeMillis;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean eventAllDay;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String eventDescription;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String eventLocation;

    public a(String str, long j15, Long l15, boolean z15, String str2, String str3) {
        this.eventTitle = str;
        this.eventStartTimeMillis = j15;
        this.eventEndTimeMillis = l15;
        this.eventAllDay = z15;
        this.eventDescription = str2;
        this.eventLocation = str3;
    }

    @Override // kx.g
    public String a() {
        return "android.intent.action.INSERT";
    }

    @Override // mz.b
    public Uri getData() {
        return CalendarContract.Events.CONTENT_URI;
    }

    @Override // mz.d
    public Bundle getExtras() {
        return e6.c.a(oq.y.a("title", this.eventTitle), oq.y.a("description", this.eventDescription), oq.y.a("beginTime", Long.valueOf(this.eventStartTimeMillis)), oq.y.a("endTime", this.eventEndTimeMillis), oq.y.a("allDay", Boolean.valueOf(this.eventAllDay)), oq.y.a("eventLocation", this.eventLocation));
    }
}
