jv-pve-manager-backend

Backend (Java)
The Java backend would serve as the intermediary between the Angular frontend and the Proxmox/Salt infrastructure. It would handle the following tasks:

    User Authentication: Implement secure login functionality.
    API Endpoints: Create RESTful APIs for the frontend to interact with.
    Proxmox Integration: Use Proxmox API to manage VM creation and configuration1
    .
    Salt Integration: Utilize Salt Cloud to automate VM deployments and configurations7
    .

Frontend (Angular)
The Angular frontend would provide a user-friendly interface for VM deployment:

    Login Page: Allow users to authenticate.
    VM Selection: Present options for VM configurations, including Apache.
    Deployment Progress: Show real-time updates during the VM creation process.

Automation Process
When a user requests a new VM with Apache, the system would:

    Use Salt Cloud to create a VM in Proxmox based on a predefined profile7
    .
    Apply a Salt state to install and configure Apache on the new VM.
    Use Proxmox API to finalize VM settings and network configuration1
    5
    .