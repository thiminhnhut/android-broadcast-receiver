# Broadcast Receiver trong Android

* **Thực hiện:** Thi Minh Nhựt - **Email:** <thiminhnhut@gmail.com>

* **Thời gian:** Ngày 27 tháng 02 năm 2019

## Nguồn tham khảo

1. [Static BroadcastReceiver](https://codinginflow.com/tutorials/android/broadcastreceiver/part-1-static-broadcastreceiver)

1. [Dynamic BroadcastReceiver](https://codinginflow.com/tutorials/android/broadcastreceiver/part-2-dynamic-broadcastreceiver)

## Examples

1. [Part 1 – Static BroadcastReceiver](https://github.com/thiminhnhut/android-broadcast-receiver/tree/master/StaticBroadcastReceiver)

    * Đăng ký trong file `AndroidManifest.xml`: [File soucre AndroidManifest.xml](https://github.com/thiminhnhut/android-broadcast-receiver/blob/master/StaticBroadcastReceiver/app/src/main/AndroidManifest.xml)

        * Cấp quyền: `<uses-permission android:name="android.permission.RECEIVE_BOOT_COMPLETED" />`

        * Đăng ký nhận Broadcast Receiver:

            ```xml
            <receiver android:name=".ExampleBroadcastReceiver">
                <intent-filter>
                    <action android:name="android.intent.action.BOOT_COMPLETED" />
                </intent-filter>
            </receiver>
            ```

    * Tạo class `ExampleBroadcastReceiver` kế thừa class `BroadcastReceiver`: [File source ExampleBroadcastReceiver.kt](https://github.com/thiminhnhut/android-broadcast-receiver/blob/master/StaticBroadcastReceiver/app/src/main/java/io/github/staticbroadcastreceiver/ExampleBroadcastReceiver.kt)

        * Khi bất kỳ sự kiện nào xảy ra, Android sẽ gọi hàm `onReceive(context: Context?, intent: Intent?)`, trong đó `intent` là những thông tin từ hệ thống.

    * File `MainActivity.kt` để mặc định: [File source MainActivity.kt](https://github.com/thiminhnhut/android-broadcast-receiver/blob/master/StaticBroadcastReceiver/app/src/main/java/io/github/staticbroadcastreceiver/MainActivity.kt)

    * Mỗi khi khởi động, nhận được message Toast lên màn hình: `Boot completed`.

1. [Part 2 – Dynamic BroadcastReceiver](https://github.com/thiminhnhut/android-broadcast-receiver/tree/master/DynamicBroadcastReceiver)

    * Tạo class `ExampleBroadcastReceiver` kế thừa class `BroadcastReceiver`: [File source ExampleBroadcastReceiver.kt](https://github.com/thiminhnhut/android-broadcast-receiver/blob/master/DynamicBroadcastReceiver/app/src/main/java/io/github/dynamicbroadcastreceiver/ExampleBroadcastReceiver.kt)

    * File `MainActivity.kt` để mặc định: [File source MainActivity.kt](https://github.com/thiminhnhut/android-broadcast-receiver/blob/master/DynamicBroadcastReceiver/app/src/main/java/io/github/dynamicbroadcastreceiver/MainActivity.kt)

        * Đăng ký Broadcast Receiver:

            ```kotlin
            val filter = IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION)
            registerReceiver(exampleBroadcastReceiver, filter)
            ```

        * Hủy đăng ký:

            ```kotlin
            unregisterReceiver(exampleBroadcastReceiver)
            ```